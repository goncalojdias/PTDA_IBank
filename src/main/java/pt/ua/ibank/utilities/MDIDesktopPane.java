package pt.ua.ibank.utilities;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public /**
         * An extension of WDesktopPane that supports often used MDI
         * functionality. This class also handles setting scroll bars for when
         * windows move too far to the left or bottom, providing the
         * MDIDesktopPane is in a ScrollPane.
         */
        class MDIDesktopPane extends JDesktopPane {

    private static final int FRAME_OFFSET = 20;

    private final MDIDesktopManager manager;
    private Image backgroundImage = null;

    public MDIDesktopPane(Image backgroundImage) {
        manager = new MDIDesktopManager(this);
        this.backgroundImage = backgroundImage;
        setDesktopManager(manager);
        setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    }

    public MDIDesktopPane() {
        manager = new MDIDesktopManager(this);
        setDesktopManager(manager);
        setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    }

    @Override
    public void setBounds(int x, int y, int w, int h) {
        super.setBounds(x, y, w, h);
        checkDesktopSize();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
    }

    public Component add(JInternalFrame frame) {
        JInternalFrame[] array = getAllFrames();
        Point p;
        int w;
        int h;

        Component retval = super.add(frame);
        checkDesktopSize();
        if (array.length > 0) {
            p = array[0].getLocation();
            p.x = p.x + FRAME_OFFSET;
            p.y = p.y + FRAME_OFFSET;
        } else {
            p = new Point(0, 0);
        }
        frame.setLocation(p.x, p.y);
        if (frame.isResizable()) {
            w = getWidth() - (getWidth() / 3);
            h = getHeight() - (getHeight() / 3);
            if (w < frame.getMinimumSize().getWidth()) {
                w = (int) frame.getMinimumSize().getWidth();
            }
            if (h < frame.getMinimumSize().getHeight()) {
                h = (int) frame.getMinimumSize().getHeight();
            }
            frame.setSize(w, h);
        }
        moveToFront(frame);
        frame.setVisible(true);
        try {
            frame.setSelected(true);
        } catch (PropertyVetoException e) {
            frame.toBack();
        }
        return retval;
    }

    @Override
    public void remove(Component c) {
        super.remove(c);
        checkDesktopSize();
    }

    /**
     * Cascade all internal frames
     */
    public void cascadeFrames() {
        int x = 0;
        int y = 0;
        JInternalFrame allFrames[] = getAllFrames();

        manager.setNormalSize();
        int frameHeight = (getBounds().height - 5) - allFrames.length * FRAME_OFFSET;
        int frameWidth = (getBounds().width - 5) - allFrames.length * FRAME_OFFSET;
        for (int i = allFrames.length - 1; i >= 0; i--) {
            allFrames[i].setSize(frameWidth, frameHeight);
            allFrames[i].setLocation(x, y);
            x = x + FRAME_OFFSET;
            y = y + FRAME_OFFSET;
        }
    }

    public void cascadeFrames(ArrayList<JInternalFrame> allFrames) {
        int x = 0;
        int y = 0;

        manager.setNormalSize();
        int frameHeight = (getBounds().height - 5) - allFrames.size() * FRAME_OFFSET;
        int frameWidth = (getBounds().width - 5) - allFrames.size() * FRAME_OFFSET;

        for (JInternalFrame frame : allFrames) {
            frame.setSize(frameWidth, frameHeight);
            frame.setLocation(x, y);
            x = x + FRAME_OFFSET;
            y = y + FRAME_OFFSET;
        }
    }

    /**
     * Tile all internal frames
     */
    public void tileFrames() {
        java.awt.Component allFrames[] = getAllFrames();
        manager.setNormalSize();
        int frameHeight = getBounds().height / allFrames.length;
        int y = 0;
        for (Component allFrame : allFrames) {
            allFrame.setSize(getBounds().width, frameHeight);
            allFrame.setLocation(0, y);
            y = y + frameHeight;
        }
    }

    /**
     * Sets all component size properties ( maximum, minimum, preferred) to the
     * given dimension.
     *
     * @param d
     */
    public void setAllSize(Dimension d) {
        setMinimumSize(d);
        setMaximumSize(d);
        setPreferredSize(d);
    }

    /**
     * Sets all component size properties ( maximum, minimum, preferred) to the
     * given width and height.
     *
     * @param width
     * @param height
     */
    public void setAllSize(int width, int height) {
        setAllSize(new Dimension(width, height));
    }

    private void checkDesktopSize() {
        if (getParent() != null && isVisible()) {
            manager.resizeDesktop();
        }
    }

}
