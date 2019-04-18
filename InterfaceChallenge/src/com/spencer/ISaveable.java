package com.spencer;

import java.util.List;

public interface ISaveable {

    List write();

    void read(List<String> arrayList);
}
