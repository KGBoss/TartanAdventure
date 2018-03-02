package edu.cmu.tartan.item;

import edu.cmu.tartan.properties.Hostable;

public class ItemFan extends Item implements Hostable {

    public ItemFan(String s, String sd, String[] a) {
        super(s, sd, a);
        this.installedItem = null;
    }

    public void install(Item i) {
        this.installedItem = i;
    }

    public boolean uninstall(Item i) {
        if (this.installedItem == null) {
            return false;
        } else if (this.installedItem == i) {
            this.installedItem = null;
            return true;
        } else {
            return false;
        }
    }

    public Item installedItem() {
        return this.installedItem;
    }

    protected Item installedItem;
    protected boolean disappears;
}
