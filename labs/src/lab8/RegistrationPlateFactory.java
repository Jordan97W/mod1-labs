package lab8;

import java.util.ArrayList;
import java.util.Random;

public class RegistrationPlateFactory {

    private static String[] registrationPlates = {
            "LA05 XYZ", "NG58 JKL", "MA13 HYP", "BX06 TUV", "CF67 QRS",
            "YS09 PQR", "WD21 NML", "KR16 FGH", "SJ04 UVW", "LV22 ABC", "WX19 XYZ"
    };

    private static ArrayList<String> availablePlates = new ArrayList<>();

    // POPULATE THE POOL ONCE, WHEN THE CLASS IS FIRST LOADED
    static {
        for (String plate : registrationPlates) {
            availablePlates.add(plate);
        }
    }

    public static RegistrationPlate getNextRegistrationPlate() throws NoRegistrationPlatesAvailableException {

        if (availablePlates.isEmpty()) {
            throw new NoRegistrationPlatesAvailableException(
                    "No registration plates left in the pool.");
        }

        Random rand = new Random();
        int index = rand.nextInt(availablePlates.size());
        String plateNumber = availablePlates.get(index);
        availablePlates.remove(index);

        return new RegistrationPlate(plateNumber);
    }
}