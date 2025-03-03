/*
 * This file is part of jGui API, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 johni0702 <https://github.com/johni0702>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.replaymod.gui.container;

public class GuiScreen extends com.replaymod.gui.container.AbstractGuiScreen<GuiScreen> {
    @SuppressWarnings("unchecked")
    public static com.replaymod.gui.container.AbstractGuiScreen from(net.minecraft.client.gui.screen.Screen minecraft) {
        if (!(minecraft instanceof com.replaymod.gui.container.AbstractGuiScreen.MinecraftGuiScreen)) {
            return null;
        }
        return ((AbstractGuiScreen.MinecraftGuiScreen) minecraft).getWrapper();
    }

    public static GuiScreen wrap(final net.minecraft.client.gui.screen.Screen minecraft) {
        return new GuiScreen() {
            @Override
            public net.minecraft.client.gui.screen.Screen toMinecraft() {
                return minecraft;
            }
        };
    }

    @Override
    protected GuiScreen getThis() {
        return this;
    }
}
