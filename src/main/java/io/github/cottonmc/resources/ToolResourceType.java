package io.github.cottonmc.resources;

public class ToolResourceType extends GenericResourceType {

    public ToolResourceType(String name) {
        super(name);
        withItemAffixes("pickaxe", "shovel", "sword", "axe", "hoe");
    }
}
