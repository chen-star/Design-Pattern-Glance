package prototype;

import lombok.Data;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-10 22:51
 */
@Data
public class PineTree extends Tree{

    public PineTree(int height) {
        this.height = height;
    }

    @Override
    public Tree copy() {
        PineTree pineTree = new PineTree(this.height);
        return pineTree;
    }
}
