package at.hsol.fountainizer.pdf.content;

/**
 * @author Felix Batusic
 */
public interface Margin {

    boolean isUppercase();

    boolean isCentered();

    boolean isUnderlined();

    float getMarginLeft();

    float getMarginRight();

    float getMarginTop();

    float getMarginBottom();

}
