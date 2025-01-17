package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    @Test
    public void old_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is a higher quality",app.items[0].quality>1 );
        
    }
    @Test
    public void never_over_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is higher quality than it should be able to",app.items[0].quality==50 );
        
    }
    @Test
    public void Sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Sulfuras changed value (shouldn't be able to)",app.items[0].quality==80 );
        
    }
    @Test
    public void conjured() {
        Item[] items = new Item[] { new Item("Conjured", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Conjured not changing at the required rate",app.items[0].quality==8 );
    }

    @Test
    public void backstage_normal() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Backstage not updating correctly",app.items[0].quality==11 );
    }

    @Test
    public void backstage_twice() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Backstage not updating correctly",app.items[0].quality==12);
    }

    @Test
    public void backstage_trice() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Backstage not updating correctly",app.items[0].quality==13 );
    }
}
