package com.tiviacz.pizzacraft.init;

import java.util.ArrayList;
import java.util.List;

import com.tiviacz.pizzacraft.PizzaCraft;
import com.tiviacz.pizzacraft.items.ArmorBase;
import com.tiviacz.pizzacraft.items.FoodBase;
import com.tiviacz.pizzacraft.items.ItemBase;
import com.tiviacz.pizzacraft.items.ItemChefHat;
import com.tiviacz.pizzacraft.items.ItemDelivererCap;
import com.tiviacz.pizzacraft.items.ItemKnife;
import com.tiviacz.pizzacraft.items.ItemMilkBottle;
import com.tiviacz.pizzacraft.items.ItemPeel;
import com.tiviacz.pizzacraft.items.ItemPizzaShield;
import com.tiviacz.pizzacraft.items.ItemPlantSeed;
import com.tiviacz.pizzacraft.items.ItemReturn;
import com.tiviacz.pizzacraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
		public static final List<Item> ITEMS = new ArrayList<Item>();
		
		//Materials

		public static final ArmorMaterial PIZZA_DELIVER_SET = EnumHelper.addArmorMaterial("pizza_deliver_set", PizzaCraft.MODID + ":deliver", 15, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		public static final ArmorMaterial CHEF_SET = EnumHelper.addArmorMaterial("chef_set", PizzaCraft.MODID + ":chef", 15, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		
		//Other
		
		public static final Item CARDBOARD = new ItemBase("cardboard");
		public static final Item PAPER_MASS = new ItemBase("paper_mass");
		public static final Item RED_CLOTH = new ItemBase("red_cloth");
		public static final Item WHITE_CLOTH = new ItemBase("white_cloth");
		public static final Item KNIFE = new ItemKnife("knife");
		public static final Item PEEL = new ItemPeel("peel", 1.0F, -3.0F);
		public static final Item PIZZA_BURNT_SHIELD = new ItemPizzaShield("pizza_burnt_shield", 6);
		public static final Item PIZZA_BOARD_SHIELD = new ItemPizzaShield("pizza_board_shield", 90);
		
		//Ingredients
		
		public static final Item HAM = new FoodBase("ham", 1, 1F, true);
		public static final Item TOMATO_SLICE = new FoodBase("tomato_slice", 1, 1F, false);
		public static final Item CUCUMBER_SLICE = new FoodBase("cucumber_slice", 1, 1F, false);
		public static final Item MILK_BOTTLE = new ItemMilkBottle("milk_bottle");
		public static final Item OLIVE_OIL = new ItemReturn("olive_oil");
		public static final Item CHEESE = new FoodBase("cheese", 2, 1F, false);
		public static final Item PIZZA_DOUGH = new ItemBase("pizza_dough");
		public static final Item FLOUR = new ItemBase("flour");
		public static final Item FLOUR_CORN = new ItemBase("flour_corn");
		public static final Item ONION = new FoodBase("onion", 2, 1F, false);
		public static final Item ONION_SLICE = new FoodBase("onion_slice", 1, 1F, false);
		public static final Item PEPPER = new FoodBase("pepper", 2, 1F, false);
		public static final Item OLIVE = new FoodBase("olive", 2, 1F, false);
		public static final Item BLACK_OLIVE = new FoodBase("black_olive", 2, 1F, false);
		public static final Item PINEAPPLE = new FoodBase("pineapple", 2, 1F, false);
		public static final Item TOMATO = new FoodBase("tomato", 2, 1F, false);
		public static final Item CUCUMBER = new FoodBase("cucumber", 2, 1F, false);
		public static final Item CORN = new FoodBase("corn", 2, 1F, false);
		public static final Item BROCCOLI = new FoodBase("broccoli", 2, 1F, false);
		
		//Seeds
		
		public static final Item SEED_ONION = new ItemPlantSeed("seed_onion", 0);
		public static final Item SEED_PEPPER = new ItemPlantSeed("seed_pepper", 1);
		public static final Item SEED_PINEAPPLE = new ItemPlantSeed("seed_pineapple", 2);
		public static final Item SEED_TOMATO = new ItemPlantSeed("seed_tomato", 3);
		public static final Item SEED_CUCUMBER = new ItemPlantSeed("seed_cucumber", 4);
		public static final Item SEED_CORN = new ItemPlantSeed("seed_corn", 5);
		public static final Item SEED_BROCCOLI = new ItemPlantSeed("seed_broccoli", 6); 
		
		//Slices
		
		public static final Item SLICE_0 = new FoodBase("slice_0", Reference.SHANKS_MARGHERITA, Reference.SATURATION, false); 	//Cheese  														//Margherita
		public static final Item SLICE_1 = new FoodBase("slice_1", Reference.SHANKS_FUNGHI, Reference.SATURATION, false); 		//Cheese / Mushrooms											//Funghi
		public static final Item SLICE_2 = new FoodBase("slice_2", Reference.SHANKS_PROSCIUTTO, Reference.SATURATION, true); 	//Cheese / Ham													//Prosciutto
		public static final Item SLICE_3 = new FoodBase("slice_3", Reference.SHANKS_MEAT, Reference.SATURATION, true);			//Cheese / Ham / Chicken / Beef / Onion							//Meat
		public static final Item SLICE_4 = new FoodBase("slice_4", Reference.SHANKS_CLASSIC, Reference.SATURATION, true); 		//Cheese / Ham / Mushrooms 										//Classic
		public static final Item SLICE_5 = new FoodBase("slice_5", Reference.SHANKS_CAPRICIOSA, Reference.SATURATION, true);	//Cheese / Ham / Pepper / olive / Mushrooms						//Capriciosa
		public static final Item SLICE_6 = new FoodBase("slice_6", Reference.SHANKS_HAWAIIAN, Reference.SATURATION, true); 		//Cheese / Ham / Pineapple										//Hawaiian
		public static final Item SLICE_7 = new FoodBase("slice_7", Reference.SHANKS_TOSCANA, Reference.SATURATION, true); 		//Cheese / Ham / Tomato / Mushrooms / Cucumber					//Toscana
		public static final Item SLICE_8 = new FoodBase("slice_8", Reference.SHANKS_RUSTICA, Reference.SATURATION, true); 		//Cheese / Ham / Corn / Mushrooms / Pepper						//Rustica
		public static final Item SLICE_9 = new FoodBase("slice_9", Reference.SHANKS_VEGETARIAN, Reference.SATURATION, false); 	//Cheese / Broccoli / Corn / Pepper / Tomato					//Vegetarian
		public static final Item SLICE_10 = new FoodBase("slice_10", Reference.SHANKS_POMPEA, Reference.SATURATION, true); 		//Cheese / Ham / Black Olive / Pepper / Onion / Mushrooms 	//Pompea
		
		//Pizza's deliver set
		
		public static final Item PIZZA_DELIVER_HAT = new ItemDelivererCap("pizza_deliver_hat", PIZZA_DELIVER_SET, 1, EntityEquipmentSlot.HEAD);
		public static final Item PIZZA_DELIVER_SHIRT = new ArmorBase("pizza_deliver_shirt", PIZZA_DELIVER_SET, 1, EntityEquipmentSlot.CHEST);
		public static final Item PIZZA_DELIVER_LEGGINGS = new ArmorBase("pizza_deliver_leggings", PIZZA_DELIVER_SET, 2, EntityEquipmentSlot.LEGS);
		public static final Item PIZZA_DELIVER_BOOTS = new ArmorBase("pizza_deliver_boots", PIZZA_DELIVER_SET, 1, EntityEquipmentSlot.FEET);
		
		//Chef's set
		
		public static final Item CHEF_HAT = new ItemChefHat("chef_hat", CHEF_SET, 1, EntityEquipmentSlot.HEAD);
		public static final Item CHEF_SHIRT = new ArmorBase("chef_shirt", CHEF_SET, 1, EntityEquipmentSlot.CHEST);
		public static final Item CHEF_LEGGINGS = new ArmorBase("chef_leggings", CHEF_SET, 2, EntityEquipmentSlot.LEGS);
		public static final Item CHEF_BOOTS = new ArmorBase("chef_boots", CHEF_SET, 1, EntityEquipmentSlot.FEET);
}