package net.boshwa.boshwasmagic.item;

import net.boshwa.boshwasmagic.BoshwasMagic;
import net.boshwa.boshwasmagic.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BoshwasMagic.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGIC_TAB = CREATIVE_MODE_TABS.register("magic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLOOD_STONE.get()))
                    .title(Component.translatable("creativetab.magic_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // blood stuff
                        pOutput.accept(ModItems.VAMPIRIC_HAMMER.get());
                        pOutput.accept(ModItems.BLOOD_STONE.get());
                        pOutput.accept(ModItems.MOLTEN_BLOOD.get());
                        pOutput.accept(ModItems.BLOOD_INGOT.get());
                        pOutput.accept(ModBlocks.BLOOD_STONE_ORE.get());
                        pOutput.accept(ModBlocks.BLOOD_STONE_BLOCK.get());
                        // sapphire stuff
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
