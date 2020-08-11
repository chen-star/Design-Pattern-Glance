package prototype;

import lombok.Data;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2020-08-10-22-51
 */
@Data
public abstract class Tree {

    protected int height;

    public abstract Tree copy();
}
