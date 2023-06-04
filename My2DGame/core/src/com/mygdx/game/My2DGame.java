package com.mygdx.game;

import com.badlogic.gdx.Game;

public class My2DGame extends Game {

	@Override
	public void create() {
		setScreen(new Play());
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void pause() {
		super.pause();
	}
}
