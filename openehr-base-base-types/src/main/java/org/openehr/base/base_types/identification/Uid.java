package org.openehr.base.base_types.identification;

import java.lang.String;

/**
 * Abstract parent of classes representing unique identifiers which identify information entities in a durable way. UIDs only ever identify one IE in time or space and are never re-used.
 */
public interface Uid {
  /**
   * The value of the id.
   */
  String getValue();
}
