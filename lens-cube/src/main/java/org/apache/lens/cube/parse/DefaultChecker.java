package org.apache.lens.cube.parse;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.apache.lens.server.api.error.LensException;

public class DefaultChecker implements DataCompletenessChecker {

  @Override
  public Map<String, Map<Date, Float>> getCompleteness(String factTag, Date start, Date end, Set<String> measureTag) throws LensException {
    return null;
  }
}
