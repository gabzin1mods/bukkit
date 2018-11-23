package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

/**
 * Called when an equippable item is dispensed from a block and equipped on a
 * nearby entity.
 * <p>
 * If a Block Dispense Armor event is cancelled, the equipment will not be
 * equipped on the target entity.
 */
public class BlockDispenseArmorEvent extends BlockDispenseEvent {

    private final LivingEntity target;

    public BlockDispenseArmorEvent(Block block, ItemStack dispensed, LivingEntity target) {
        super(block, dispensed, new Vector(0, 0, 0));
        this.target = target;
    }

    /**
     * Get the living entity on which the armor was dispensed.
     *
     * @return the target entity
     */
    public LivingEntity getTargetEntity() {
        return target;
    }
}