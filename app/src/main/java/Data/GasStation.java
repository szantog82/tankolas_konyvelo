package Data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


//Benzinkút tábla két oszlopa, egy ID és a kút neve
//Ezek a táblák fixen fel lesznek töltve a benzikutakkal pl: OMW, Shell, MOL
@Entity
public class GasStation {

    @PrimaryKey (autoGenerate = true)
    public int id;

    @ColumnInfo(name = "Benzinkút")
    public String name;
}
