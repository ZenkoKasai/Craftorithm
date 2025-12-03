package pers.yufiria.craftorithm.ui.creator.tag;

import crypticlib.ui.display.Icon;
import crypticlib.ui.display.IconDisplay;
import org.bukkit.Material;

/**
 * Placeholder icon used by the tag creator UI.
 * Uses an empty AIR display by default.
 */
public class TagIcon extends Icon {

    public TagIcon() {
        super(new IconDisplay(Material.AIR));
    }
}
