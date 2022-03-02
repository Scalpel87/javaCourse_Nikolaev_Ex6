import java.awt.*;

public enum Season {   
    
    SUMMER(new Color(0, 80, 0)), AUTUMN(new Color(80, 80, 80)), WINTER(new Color(255, 255, 255)), SPRING(new Color(239, 114, 21));

    private Color color;


    Season(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
