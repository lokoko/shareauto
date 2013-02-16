package com.shareauto.utils;

import android.content.Context;
import android.util.TypedValue;

public class Utils {
  public static int dipToPx(Context context, float dip) {
    return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, context.getResources().getDisplayMetrics());
  }

}
