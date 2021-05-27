package Data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

//Az üzemanyag tipusok táblája, idegen kulcs összekötéssel a benzinkút táblával
//Ezek a táblák fixen fel lesznek töltve adattal pl: MaxMotion 95, OMW kuttal összekötve
@Entity (foreignKeys = {@ForeignKey(entity = GasStation.class,
        parentColumns = "id",
        childColumns = "GSid",
        onDelete = ForeignKey.CASCADE)
})
public class Fuel {

    @PrimaryKey (autoGenerate = true)
    public int id;

    @ColumnInfo ( name = "Üzemanyag")
    public String FuelName;

    public int GSid;
}
