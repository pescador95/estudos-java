package com.pescador95.deitel.account.interfaces.io;

import com.pescador95.deitel.account.dto.InputDTO;

public interface IO {

    InputDTO insert(String theName, Double theBalance);

    InputDTO insert();

}
