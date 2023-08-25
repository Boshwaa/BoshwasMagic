package net.boshwa.boshwasmagic.item;

import net.boshwa.boshwasmagic.BoshwasMagic;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BoshwasMagic.MOD_ID);

    public static final RegistryObject<Item> BLOOD_STONE = ITEMS.register("blood_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_INGOT = ITEMS.register("blood_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> VAMPIRIC_HAMMER = ITEMS.register("vampiric_hammer",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> MOLTEN_BLOOD = ITEMS.register("molten_blood",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
