package com.tosend.utils;

import java.io.*;
import java.util.*;

public class LoadResource {
  public void ResourceReader() {
    
    Locale locale = Locale.getDefault();

    ResourceBundle i18n = ResourceBundle.getBundle("", locale, new CustomClassLoader("#FileChooser"));

  }
}

