package com.snijsure.rssreader.data.network.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "channel")
public class RssLink implements Serializable {
    @Element(name = "link")
    private static String link;

    public  String getLink() {
        return link;
    }

}
