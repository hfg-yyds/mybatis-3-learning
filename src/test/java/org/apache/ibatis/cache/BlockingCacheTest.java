package org.apache.ibatis.cache;

import org.apache.ibatis.cache.decorators.BlockingCache;
import org.apache.ibatis.cache.decorators.LruCache;
import org.apache.ibatis.cache.impl.PerpetualCache;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *
 * </p>
 *
 * @author: 韩福贵
 * @date: 2023-08-26
 */
public class BlockingCacheTest {

  @Test
  public void test() {
    BlockingCache cache = new BlockingCache(new PerpetualCache("1"));
//    cache.putObject("age","26");
  }

}
