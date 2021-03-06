package com.tiviacz.pizzacraft.tileentity;

import com.tiviacz.pizzacraft.handlers.ConfigHandler;
import com.tiviacz.pizzacraft.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityRawPizza extends TileEntity implements ITickable
{
	private int ticks = 0;
	private boolean isCooking = false;
	 
	@Override
	public void update() 
	{
		Block oven = world.getBlockState(pos.down()).getBlock();
		Block pizza = world.getBlockState(pos).getBlock();
		
		if(oven == ModBlocks.BURNING_PIZZA_OVEN)
		{
			isCooking = true;
			
			if(pizza == ModBlocks.RAW_PIZZA_0)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeMargherita)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_0.getDefaultState(), 3);			
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_1)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeFunghi)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_1.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_2)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeProsciutto)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_2.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_3)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeMeat)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_3.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_4)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeClassic)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_4.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_5)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeCapriciosa)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_5.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_6)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeHawaiian)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_6.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_7)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeToscana)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_7.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_8)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeRustica)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_8.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_9)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimeVegan)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_9.getDefaultState(), 3);
				}
			}
			
			if(pizza == ModBlocks.RAW_PIZZA_10)
			{
				ticks++; 
				
				if(ticks == ConfigHandler.cookingTimePompea)
				{
					world.setBlockState(pos, ModBlocks.PIZZA_10.getDefaultState(), 3);
				}
			}
		}
		else
		{
			isCooking = false;
		}
	}
	
	public boolean isCooking()
	{
		return this.isCooking;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("RawPizzaTicksValue", this.ticks);
		compound.setBoolean("IsCooking", this.isCooking);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.ticks = compound.getInteger("RawPizzaTicksValue");
		this.isCooking = compound.getBoolean("IsCooking");
	}
}