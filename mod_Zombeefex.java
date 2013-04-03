package mods.nurseangel.Zombeefex;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.src.MLProp;
import net.minecraft.src.ModLoader;

public class mod_Zombeefex extends BaseMod {
	@Override
	public String getVersion() {
		return "1.5.1.0";
	}

	@Override
	public void load() {
		// 基本
		itemZombeefex = new ItemZombeefex(itemZombeefexID, -19, ItemIDZombeefEx, 0x228b22).setUnlocalizedName("itemZombeefex");
		// 猛毒
		itemZombeefexPoison = new ItemZombeefex(itemZombeefexPoisonID, -19, ItemIDZombeefExPoison, 0x0000ff, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexPoison");
		// 盲目
		itemZombeefexBlind = new ItemZombeefex(itemZombeefexBlindID, -19, itemIDZombeefExBlind, 0x000000, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexBlind");
		// 鈍足
		itemZombeefexSlow = new ItemZombeefex(itemZombeefexSlowID, -19, itemIDZombeefExSlow, 0x00ff00, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexSlow");
		// 混乱
		itemZombeefexConf = new ItemZombeefex(itemZombeefexConfID, -19, itemIDZombeefExConf, 0x00ffff, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexConf");
		// 弱体
		itemZombeefexWeak = new ItemZombeefex(itemZombeefexWeakID, -19, itemIDZombeefExWeak, 0x808080, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexWeak");
		// 耐火
		itemZombeefexFire = new ItemZombeefex(itemZombeefexFireID, -19, itemIDZombeefExFire, 0xff0000, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexFire");
		// 障害
		itemZombeefexHarm = new ItemZombeefex(itemZombeefexHarmID, -19, itemIDZombeefExHarm, 0xff00ff).setUnlocalizedName("itemZombeefexHarm");
		// 鈍堀
		itemZombeefexDigSlow = new ItemZombeefex(itemZombeefexDigSlowID, -19, itemIDZombeefExDigSlow, 0xff8000, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexDigSlow");
		// 空腹
		itemZombeefexHunger = new ItemZombeefex(itemZombeefexHungerID, -19, itemIDZombeefExHunger, 0xffff00, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexHunger");
		// 全部
		itemZombeefexSuper = new ItemZombeefex(itemZombeefexSuperID, 20, itemIDZombeefExSuper, 0xffffff, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexSuper");
		// 餓鬼道
		BuddhistPurgatoryOfHunger = new ItemZombeefex(BuddhistPurgatoryOfHungerID, 20, ItemIDBuddhistPurgatoryOfHunger, 0x8000ff)
				.setUnlocalizedName("BuddhistPurgatoryOfHunger");
		// 夜目
		itemZombeefexNightVision = new ItemZombeefex(itemZombeefexNightVisionID, -19, itemIDZombeefExNightVision, 0x00ff80, intPotionEffectSecond,
				intPotionEffectAmplifier).setUnlocalizedName("itemZombeefexNightVision");
		// 透明
		itemZombeefexInvisibility = new ItemZombeefex(itemZombeefexInvisibilityID, -19, itemIDZombeefExInvisibility, 0x80ff00, intPotionEffectSecond,
				intPotionEffectAmplifier).setUnlocalizedName("itemZombeefexInvisibility");
		// 水中呼吸
		itemZombeefexWaterBreathing = new ItemZombeefex(itemZombeefexWaterBreathingID, -19, itemIDZombeefexWaterBreathing, 0xff0080, intPotionEffectSecond,
				intPotionEffectAmplifier).setUnlocalizedName("itemZombeefexWaterBreathing");
		// Wither
		itemZombeefexWither = new ItemZombeefex(itemZombeefexWitherID, -19, itemIDZombeefexWither, 0x0080ff, intPotionEffectSecond, intPotionEffectAmplifier)
				.setUnlocalizedName("itemZombeefexWither");
		// 名前
		ModLoader.addName(itemZombeefex, "Zombeef Ex");
		ModLoader.addName(itemZombeefexPoison, "Zombeef Ex Poison");
		ModLoader.addName(itemZombeefexBlind, "Zombeef Ex Blind");
		ModLoader.addName(itemZombeefexSlow, "Zombeef Ex Slowdown");
		ModLoader.addName(itemZombeefexDigSlow, "Zombeef Ex DigSlow");
		ModLoader.addName(itemZombeefexConf, "Zombeef Ex Confusion");
		ModLoader.addName(itemZombeefexWeak, "Zombeef Ex Weakness");
		ModLoader.addName(itemZombeefexFire, "Zombeef Ex FireResistance");
		ModLoader.addName(itemZombeefexHarm, "Zombeef Ex Harmful");
		ModLoader.addName(itemZombeefexHunger, "Zombeef Ex Hunger");
		ModLoader.addName(itemZombeefexSuper, "Zombeef Ex Super");
		ModLoader.addName(itemZombeefexNightVision, "Zombeef Ex NightVision");
		ModLoader.addName(BuddhistPurgatoryOfHunger, "Buddhist Purgatory of Hunger");
		ModLoader.addName(itemZombeefexInvisibility, "Zombeef Ex Invisibility");
		ModLoader.addName(itemZombeefexWaterBreathing, "Zombeef Ex Water Breathing");
		ModLoader.addName(itemZombeefexWither, "Zombeef Ex Wither");
		// レシピ
		ModLoader.addRecipe(new ItemStack(itemZombeefex, 1), new Object[] { "XXX", 'X', Item.rottenFlesh });
		ModLoader.addRecipe(new ItemStack(itemZombeefexPoison, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.rottenFlesh });
		ModLoader.addRecipe(new ItemStack(itemZombeefexBlind, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.spiderEye });
		ModLoader.addRecipe(new ItemStack(itemZombeefexSlow, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.silk });
		ModLoader.addRecipe(new ItemStack(itemZombeefexDigSlow, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.snowball });
		ModLoader.addRecipe(new ItemStack(itemZombeefexConf, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.slimeBall });
		ModLoader.addRecipe(new ItemStack(itemZombeefexWeak, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.sugar });
		ModLoader.addRecipe(new ItemStack(itemZombeefexFire, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.magmaCream });
		ModLoader.addRecipe(new ItemStack(itemZombeefexHarm, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Block.tnt });
		ModLoader.addRecipe(new ItemStack(itemZombeefexHunger, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.leather });
		ModLoader.addRecipe(new ItemStack(itemZombeefexNightVision, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefex, 'Y', Item.eyeOfEnder });
		ModLoader.addRecipe(new ItemStack(BuddhistPurgatoryOfHunger, 1), new Object[] { "XXX", 'X', mod_Zombeefex.itemZombeefex });
		ModLoader.addRecipe(new ItemStack(itemZombeefexSuper, 1), new Object[] { "ABC", "DEF", "GHI", 'A', mod_Zombeefex.itemZombeefexPoison, 'B',
				mod_Zombeefex.itemZombeefexBlind, 'C', mod_Zombeefex.itemZombeefexSlow, 'D', mod_Zombeefex.itemZombeefexDigSlow, 'E',
				mod_Zombeefex.itemZombeefexConf, 'F', mod_Zombeefex.itemZombeefexWeak, 'G', mod_Zombeefex.itemZombeefexFire, 'H',
				mod_Zombeefex.itemZombeefexHarm, 'I', mod_Zombeefex.itemZombeefexHunger });
		ModLoader.addRecipe(new ItemStack(itemZombeefexInvisibility, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefexSuper, 'Y',
				mod_Zombeefex.itemZombeefexNightVision });
		ModLoader.addRecipe(new ItemStack(itemZombeefexWaterBreathing, 2), new Object[] { "XYX", 'X', mod_Zombeefex.itemZombeefexSuper, 'Y',
				mod_Zombeefex.itemZombeefexFire });
		ModLoader.addRecipe(new ItemStack(itemZombeefexWither, 2), new Object[] { "XXX", 'X', mod_Zombeefex.itemZombeefexSuper });

		if (isTest) {
			ModLoader.addRecipe(new ItemStack(itemZombeefex, 10), new Object[] { "X", 'X', Block.dirt });
			ModLoader.addRecipe(new ItemStack(itemZombeefexPoison, 10), new Object[] { "X", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexBlind, 10), new Object[] { "XXX", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexSlow, 10), new Object[] { "XX", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexDigSlow, 10), new Object[] { "XX", "XX", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexConf, 10), new Object[] { "X X", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexWeak, 10), new Object[] { "X  ", "X  ", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexFire, 10), new Object[] { "X  ", " X ", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexHarm, 10), new Object[] { "X  ", "  X", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexHunger, 10), new Object[] { " X ", "X  ", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexSuper, 10), new Object[] { " X ", " X ", " X ", 'X', mod_Zombeefex.itemZombeefex });
			ModLoader.addRecipe(new ItemStack(itemZombeefexInvisibility, 10), new Object[] { " X ", " X ", " X ", 'X', mod_Zombeefex.itemZombeefexSuper });
		}
	}

	// アイテムID
	@MLProp(info = "itemZombeefex ID", name = "itemZombeefexID")
	public static int itemZombeefexID = 5000;
	@MLProp(info = "itemZombeefex Poison ID", name = "itemZombeefexPoisonID")
	public static int itemZombeefexPoisonID = 5001;
	@MLProp(info = "itemZombeefex Blind ID", name = "itemZombeefexBlindID")
	public static int itemZombeefexBlindID = 5002;
	@MLProp(info = "itemZombeefex Slowdown ID", name = "itemZombeefexSlowID")
	public static int itemZombeefexSlowID = 5003;
	@MLProp(info = "itemZombeefex Confusion ID", name = "itemZombeefexConfID")
	public static int itemZombeefexConfID = 5004;
	@MLProp(info = "itemZombeefex Weakness ID", name = "itemZombeefexWeakID")
	public static int itemZombeefexWeakID = 5005;
	@MLProp(info = "itemZombeefex FireResist ID", name = "itemZombeefexFireID")
	public static int itemZombeefexFireID = 5006;
	@MLProp(info = "itemZombeefex Harm ID", name = "itemZombeefexHarmID")
	public static int itemZombeefexHarmID = 5007;
	@MLProp(info = "itemZombeefex DigSlow ID", name = "itemZombeefexDigSlowID")
	public static int itemZombeefexDigSlowID = 5008;
	@MLProp(info = "itemZombeefex Hunger ID", name = "itemZombeefexHungerID")
	public static int itemZombeefexHungerID = 5009;
	@MLProp(info = "itemZombeefex Super ID", name = "itemZombeefexSuperID")
	public static int itemZombeefexSuperID = 5010;
	@MLProp(info = "BuddhistPurgatoryOfHunger ID", name = "BuddhistPurgatoryOfHunger")
	public static int BuddhistPurgatoryOfHungerID = 5011;
	@MLProp(info = "itemZombeefex NightVision ID", name = "itemZombeefexNightVisionID")
	public static int itemZombeefexNightVisionID = 5012;
	@MLProp(info = "itemZombeefex Invisiblity ID", name = "itemZombeefexInvisibilityID")
	public static int itemZombeefexInvisibilityID = 5013;
	@MLProp(info = "itemZombeefex Water Breathing ID", name = "itemZombeefexWaterBreathingID")
	public static int itemZombeefexWaterBreathingID = 5014;
	@MLProp(info = "itemZombeefex Wither ID", name = "itemZombeefexWitherID")
	public static int itemZombeefexWitherID = 5015;

	// 効果の設定
	@MLProp(info = "potion effect second", name = "intPotionEffectSecond")
	public static int intPotionEffectSecond = 60;
	@MLProp(info = "potion effect Amplifier", name = "intPotionEffectAmplifier")
	public static int intPotionEffectAmplifier = 1;
	@MLProp(info = "Always false")
	public static boolean isTest = false;

	// インスタンス
	public static Item itemZombeefex;
	public static Item itemZombeefexPoison;
	public static Item itemZombeefexBlind;
	public static Item itemZombeefexSlow;
	public static Item itemZombeefexConf;
	public static Item itemZombeefexWeak;
	public static Item itemZombeefexFire;
	public static Item itemZombeefexHarm;
	public static Item itemZombeefexDigSlow;
	public static Item itemZombeefexHunger;
	public static Item itemZombeefexSuper;
	public static Item BuddhistPurgatoryOfHunger;
	public static Item itemZombeefexNightVision;
	public static Item itemZombeefexInvisibility;
	public static Item itemZombeefexWaterBreathing;
	public static Item itemZombeefexWither;

	// アイテム識別用
	public static final int ItemIDZombeefEx = 1;
	public static final int ItemIDZombeefExPoison = 2;
	public static final int itemIDZombeefExBlind = 3;
	public static final int itemIDZombeefExSlow = 4;
	public static final int itemIDZombeefExConf = 5;
	public static final int itemIDZombeefExWeak = 6;
	public static final int itemIDZombeefExFire = 7;
	public static final int itemIDZombeefExHarm = 8;
	public static final int itemIDZombeefExDigSlow = 9;
	public static final int itemIDZombeefExHunger = 10;
	public static final int itemIDZombeefExSuper = 99;
	public static final int ItemIDBuddhistPurgatoryOfHunger = 11;
	public static final int itemIDZombeefExNightVision = 12;
	public static final int itemIDZombeefExInvisibility = 13;
	public static final int itemIDZombeefexWaterBreathing = 14;
	public static final int itemIDZombeefexWither = 15;

	// TODO ダメージ値にしたい

}