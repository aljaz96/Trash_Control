package com.badlogic.drop.desktop;

import com.badlogic.drop.Igra;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Trash Control";
        config.width = 800;
        config.height = 480;
		config.useGL30 = true;
		new LwjglApplication(new Igra(), config);
	}
}
