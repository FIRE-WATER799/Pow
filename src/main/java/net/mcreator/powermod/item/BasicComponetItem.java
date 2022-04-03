
package net.mcreator.powermod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.powermod.itemgroup.PowerModItemGroup;
import net.mcreator.powermod.PowerModModElements;

@PowerModModElements.ModElement.Tag
public class BasicComponetItem extends PowerModModElements.ModElement {
	@ObjectHolder("power_mod:basic_componet")
	public static final Item block = null;

	public BasicComponetItem(PowerModModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PowerModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("basic_componet");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
