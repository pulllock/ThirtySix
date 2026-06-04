package fun.pullock.gof.behavioral.c5_11;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
