package nurseangel.mod_Zombeefex;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemZombeefex extends ItemFood
{
    public int zombeefItemID; //ItemのIDではなくmod_Zombeefexでのみ使用する
    public int colorFromDamage; //色
    public int potionEffectiveTime = 1200; //ポーションの有効期限
    public int potionAmplifier = 0; //ポーションの強度

    /*
     * @param int ItemID
     * @param int healAmount
     * @param int mod_Zombeefexでアイテムを識別するID
     * @param int getColorFromDamageの色
     * @param int ポーションの有効期間(秒？) デフォルト60秒
     * @param int ポーションの強度 1がI,2がII,… デフォルト1
     */
    public ItemZombeefex(int i, int healAmount, int zombeefItemID, int colorFromDamage, int potionEffectiveTime, int potionAmplifier)
    {
        this(i,  healAmount,  zombeefItemID,  colorFromDamage);
        this.setPotionData(potionEffectiveTime, potionAmplifier);
    }

    public ItemZombeefex(int i, int healAmount, int zombeefItemID, int colorFromDamage)
    {
        super(i, healAmount, true);
        maxStackSize = 64;
        this.setAlwaysEdible(); //can eat always
        //色
        this.colorFromDamage = colorFromDamage;
        this.potionEffectiveTime = potionEffectiveTime * 20;
        this.potionAmplifier = potionAmplifier - 1;
        /*
         * switch(par1ItemStack.itemID){
         *  case mod_Zombeefex.itemZombeefexIDとかができなかったので、かわりにmod_Zombeefex内でのみ使うアイテムID
         */
        this.zombeefItemID = zombeefItemID;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2)
    {
        return colorFromDamage;
    }

    /*
     * ポーションの効果をセット
     * @param int 有効期間(秒？) デフォルト60秒
     * @param int 強度 1がI,2がII,… デフォルト1
     */
    public void setPotionData(int i , int j)
    {
        this.potionEffectiveTime = i * 20;
        this.potionAmplifier = j - 1;
        return;
    }

    /*
     * アイテムを食べた
     */
    @Override
    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        //アイテムを減らす
        --par1ItemStack.stackSize;
        //音
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);

        // その他の効果
        switch (this.zombeefItemID)
        {
            case mod_Zombeefex.ItemIDZombeefEx:
                par3EntityPlayer.getFoodStats().setFoodLevel(0);
                break;

            case mod_Zombeefex.ItemIDZombeefExPoison:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExBlind:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExSlow:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExDigSlow:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExConf:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExWeak:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExFire:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, (int)potionEffectiveTime / 2, potionAmplifier));
                par3EntityPlayer.setFire(potionEffectiveTime);
                break;

            case mod_Zombeefex.itemIDZombeefExHunger:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExHarm:
                par3EntityPlayer.getFoodStats().setFoodLevel(20);
                par3EntityPlayer.setEntityHealth(1);
                par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 1.0F, 1.0F);
                //par3EntityPlayer.jump();
                break;

            case mod_Zombeefex.itemIDZombeefExSuper:
                par3EntityPlayer.getFoodStats().setFoodLevel(20);
                par3EntityPlayer.setEntityHealth(1);
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, potionEffectiveTime, potionAmplifier));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, (int)potionEffectiveTime / 2, potionAmplifier));
                par3EntityPlayer.setFire(potionEffectiveTime);
                par2World.playSoundAtEntity(par3EntityPlayer, "random.explode", 1.0F, 1.0F);
                break;

            case mod_Zombeefex.ItemIDBuddhistPurgatoryOfHunger:
                par3EntityPlayer.getFoodStats().setFoodSaturationLevel(0F);
                par3EntityPlayer.getFoodStats().setFoodLevel(-65535);
                break;

            case mod_Zombeefex.itemIDZombeefExNightVision:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefExInvisibility:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefexWaterBreathing:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, potionEffectiveTime, potionAmplifier));
                break;

            case mod_Zombeefex.itemIDZombeefexWither:
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.wither.id, potionEffectiveTime, potionAmplifier));
                break;

            default:
                break;
        }

        return par1ItemStack;
    }
}
