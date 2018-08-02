package net.perfectdreams.dreamcore.utils.extensions

import com.comphenix.protocol.wrappers.nbt.NbtCompound
import net.perfectdreams.dreamcore.utils.ItemUtils
import net.perfectdreams.dreamcore.utils.tags.NbtTagsUtils
import org.bukkit.inventory.ItemStack

fun ItemStack.getCompoundTag() = NbtTagsUtils.getCompoundTag(this)
fun ItemStack.setCompoundTag(tag: NbtCompound) = NbtTagsUtils.setCompoundTag(this, tag)
fun ItemStack.getStoredMetadata(key: String) = ItemUtils.getStoredMetadata(this, key)
fun ItemStack.storeMetadata(key: String, value: String) = ItemUtils.storeMetadata(this, key, value)
fun ItemStack.hasStoredMetadataWithKey(key: String) = ItemUtils.hasStoredMetadataWithKey(this, key)