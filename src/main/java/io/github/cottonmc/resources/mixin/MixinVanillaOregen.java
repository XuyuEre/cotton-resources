package io.github.cottonmc.resources.mixin;

import io.github.cottonmc.resources.CottonResources;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public abstract class MixinVanillaOregen {


    @Inject(method = "addDefaultOres", at = @At(value = "HEAD"))
    private static void mixinDefaultOres(Biome biome_1, CallbackInfo ci) {
        if (CottonResources.config.override_vanilla_generation) {
            ci.cancel();
        }
    }

    @Inject(method = "addExtraGoldOre", at = @At(value = "HEAD"))
    private static void mixinExtraGoldOre(Biome biome_1, CallbackInfo ci) {
        if (CottonResources.config.override_vanilla_generation) {
            ci.cancel();
        }
    }

    @Inject(method = "addEmeraldOre", at = @At(value = "HEAD"))
    private static void mixinEmeraldOre(Biome biome_1, CallbackInfo ci) {
        if (CottonResources.config.override_vanilla_generation) {
            ci.cancel();
        }
    }
}
