import java.util.Scanner;

public class coba {
    // Banner pembuka, silakan manfaatkan variabel ini untuk menampilkan banner di awal dan di akhir program
    private static final String BANNER = """
                    █     █░▓█████  ██▓     ▄████▄   ▒█████   ███▄ ▄███▓▓█████                        
                    ▓█░ █ ░█░▓█   ▀ ▓██▒    ▒██▀ ▀█  ▒██▒  ██▒▓██▒▀█▀ ██▒▓█   ▀                        
                    ▒█░ █ ░█ ▒███   ▒██░    ▒▓█    ▄ ▒██░  ██▒▓██    ▓██░▒███                          
                    ░█░ █ ░█ ▒▓█  ▄ ▒██░    ▒▓▓▄ ▄██▒▒██   ██░▒██    ▒██ ▒▓█  ▄                        
                    ░░██▒██▓ ░▒████▒░██████▒▒ ▓███▀ ░░ ████▓▒░▒██▒   ░██▒░▒████▒                       
                    ░ ▓░▒ ▒  ░░ ▒░ ░░ ▒░▓  ░░ ░▒ ▒  ░░ ▒░▒░▒░ ░ ▒░   ░  ░░░ ▒░ ░                       
                        ▒ ░ ░   ░ ░  ░░ ░ ▒  ░  ░  ▒     ░ ▒ ▒░ ░  ░      ░ ░ ░  ░                       
                        ░   ░     ░     ░ ░   ░         ░ ░ ░ ▒  ░      ░      ░                          
                        ░       ░  ░    ░  ░░ ░          ░ ░         ░      ░  ░                       
                                            ░                                                          
                                        ▄▄▄█████▓ ▒█████                                              
                                        ▓  ██▒ ▓▒▒██▒  ██▒                                            
                                        ▒ ▓██░ ▒░▒██░  ██▒                                            
                                        ░ ▓██▓ ░ ▒██   ██░                                            
                                        ▒██▒ ░ ░ ████▓▒░                                            
                                        ▒ ░░   ░ ▒░▒░▒░                                             
                                            ░      ░ ▒ ▒░                                             
                                        ░      ░ ░ ░ ▒                                              
                                                    ░ ░                                              
                                                                                                  
 ▄▄▄▄    █    ██  ██▀███   ██░ ██  ▄▄▄       ███▄    █   █████   █    ██ ▓█████   ██████ ▄▄▄█████▓
▓█████▄  ██  ▓██▒▓██ ▒ ██▒▓██░ ██▒▒████▄     ██ ▀█   █ ▒██▓  ██▒ ██  ▓██▒▓█   ▀ ▒██    ▒ ▓  ██▒ ▓▒
▒██▒ ▄██▓██  ▒██░▓██ ░▄█ ▒▒██▀▀██░▒██  ▀█▄  ▓██  ▀█ ██▒▒██▒  ██░▓██  ▒██░▒███   ░ ▓██▄   ▒ ▓██░ ▒░
▒██░█▀  ▓▓█  ░██░▒██▀▀█▄  ░▓█ ░██ ░██▄▄▄▄██ ▓██▒  ▐▌██▒░██  █▀ ░▓▓█  ░██░▒▓█  ▄   ▒   ██▒░ ▓██▓ ░ 
░▓█  ▀█▓▒▒█████▓ ░██▓ ▒██▒░▓█▒░██▓ ▓█   ▓██▒▒██░   ▓██░░▒███▒█▄ ▒▒█████▓ ░▒████▒▒██████▒▒  ▒██▒ ░ 
░▒▓███▀▒░▒▓▒ ▒ ▒ ░ ▒▓ ░▒▓░ ▒ ░░▒░▒ ▒▒   ▓▒█░░ ▒░   ▒ ▒ ░░ ▒▒░ ▒ ░▒▓▒ ▒ ▒ ░░ ▒░ ░▒ ▒▓▒ ▒ ░  ▒ ░░   
▒░▒   ░ ░░▒░ ░ ░   ░▒ ░ ▒░ ▒ ░▒░ ░  ▒   ▒▒ ░░ ░░   ░ ▒░ ░ ▒░  ░ ░░▒░ ░ ░  ░ ░  ░░ ░▒  ░ ░    ░    
 ░    ░  ░░░ ░ ░   ░░   ░  ░  ░░ ░  ░   ▒      ░   ░ ░    ░   ░  ░░░ ░ ░    ░   ░  ░  ░    ░      
 ░         ░        ░      ░  ░  ░      ░  ░         ░     ░       ░        ░  ░      ░           
      ░                                                                                           
            """;
    private static final String STUDENT_NAME = "Kayla Alifah Khairunisa";
    private static final String STUDENT_ID = "2506611931";


    // Penanda atribut, silakan manfaatkan variabel ini untuk menandai atribut di dalam data
    // Atribut yang sama
    private static final char NAME_IDENTIFIER = '!';
    private static final char STATUS_IDENTIFIER = '@';
    private static final char EXP_IDENTIFIER = '#';

    // Atribut khusus quest
    private static int questId = 1;
    private static final char REWARD_IDENTIFIER = '$';
    private static final char DESC_IDENTIFIER = '%';
    private static final char DIFFICULTY_IDENTIFIER = '^';

    // Atribut khusus pengembara
    private static int travelerId = 1;
    private static final char LEVEL_IDENTIFIER = '$';

    private static final int MAX_EXP = 1_310_720_000;

    // Scanner untuk input, silakan manfaatkan variabel ini untuk mengambil input dari user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println(BANNER);
        System.out.println("Dibuat oleh: " + STUDENT_NAME + " - " + STUDENT_ID);
        System.out.println("Mari kita mulai dengan membuat sejumlah data quest dan pengembara.");

        // TODO: Seeding data quest dan pengembara
        int questCount = 0;
        int travelerCount = 0;
        boolean validInput = false;

        // TODO: Input banyak quest dan pengembara
        while (!validInput) {
            System.out.print("Silakan masukkan banyak quest yang ingin didaftarkan: ");
            String questCountInput = input.nextLine().trim();
            if (questCountInput.matches("\\d+")){
                questCount = Integer.parseInt(questCountInput);
                if (questCount >= 0){
                    validInput = true;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }   
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }
}
            // TODO: Validasi input jumlah quest

            
        
        // TODO: Input jumlah pengembara
        boolean invalidInput = true;
        while (invalidInput) {
            System.out.print("Silakan masukkan banyak pengembara yang ingin didaftarkan: ");
            String travelerCountInput = input.nextLine().trim();
            // TODO: Validasi input jumlah pengembara
            if (travelerCountInput.matches("\\d+")){
                travelerCount = Integer.parseInt(travelerCountInput);
                if (travelerCount >= 0){
                    invalidInput = false;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }   
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }
}
        System.out.println();
        String questData = "";
        String travelerData = "";
        System.out.println("Mulai memasukkan data quest.");
        // TODO: Input data quest sebanyak quest yang diminta




        for (int i = 0; i < questCount; i++) {
            boolean validInput1 = false;
            boolean validInput2 = false;
            boolean validInput3 = false;
            boolean validInput4 = false;
            boolean validInput5 = false;
            String questStatus = "tersedia";
            System.out.println("Quest " + (i+1));
            //input nama quest
            while (!validInput1){
                System.out.println("Masukkan nama quest: ");
                String questName = input.nextLine().trim();

                if (questName.matches("[a-zA-Z0-9\\s]+")){
                    validInput1 = true;
                    questData += "+"+"Q"+questId + ";" + NAME_IDENTIFIER + questName;
                    questId++;
                }else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                }}
            //input deskripsi quest
            while (!validInput2){
                System.out.println("Masukkan deskripsi quest: ");
                String questDesc = input.nextLine().trim();

                if (questDesc.matches("[a-zA-Z0-9\\s]+")){
                    validInput2 = true;
                    questData += ";" + DESC_IDENTIFIER + questDesc;
                }else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                }}
            validInput2 = false;
            //input reward quest
            while (!validInput3){
                System.out.println("Masukkan reward quest berupa bilangan bulat nonnegatif: ");
                String questReward = input.nextLine().trim();

                if (questReward.matches("\\d+")){
                    int questRewardInt = Integer.parseInt(questReward);
                    if (questRewardInt >= 0 ){
                    validInput3 = true;
                    questData += ";" + REWARD_IDENTIFIER + questReward;
                    }else{
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                    }
                    
                }else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                }}     
            //input Exp quest  
            while (!validInput4){
                System.out.println("Masukkan bonus exp quest berupa bilangan bulat nonnegatif: ");
                String questExp = input.nextLine().trim();

                if (questExp.matches("\\d+")){
                    int questExpInt = Integer.parseInt(questExp);
                    if (questExpInt >= 0 ){
                    validInput4 = true;
                    questData += ";" + EXP_IDENTIFIER + questExp;
                    }else{
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                    }
                    
                }else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                }}   
            //input difficulty quest
            while (!validInput5){
                System.out.println("Masukkan tingkat kesulitan quest (opsi: mudah, menengah, sulit): ");
                String questDiffInput= input.nextLine().trim();

                String questDifficulty = questDiffInput.toLowerCase();
                if (questDifficulty.equals("mudah")||questDifficulty.equals("menengah") || questDifficulty.equals("sulit")){
                    questData += ";"+ DIFFICULTY_IDENTIFIER + questDifficulty;
                    validInput5 = true;
                    }else{
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                    }}  
            questData += ";" + STATUS_IDENTIFIER + questStatus;
            System.out.println("Quest berhasil ditambahkan!");
            }

        System.out.println();

        System.out.println("Mulai memasukkan data pengembara.");
        // TODO: Input data pengembara sebanyak pengembara yang diminta
        int travelerExp = 0;
        String travelerStatus = "kosong";
        for (int i = 0; i < travelerCount; i++) {
            boolean validInputPengembara1 = false;
            boolean validInputPengembara2 = false;
            while (!validInputPengembara1){
                System.out.println("Masukkan nama pengembara: ");
                String travelerName = input.nextLine().trim();
                if (travelerName.matches("[a-zA-Z0-9\\s]+")){
                    travelerData += "+"+"P"+travelerId + ";" + NAME_IDENTIFIER + travelerName; 
                    validInputPengembara1 = true;
                    travelerId++;
                    
                } else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }
            }
            while (!validInputPengembara2){
                System.out.println("Masukkan level pengembara berupa bilangan bulat [1,20]: ");
                String travelerLevel = input.nextLine().trim();
                if (travelerLevel.matches("\\d+")){
                    int travelerLevelInt = Integer.parseInt(travelerLevel);
                    if ((travelerLevelInt >= 1)&&(travelerLevelInt<=20)){
                        travelerData += ";" + LEVEL_IDENTIFIER + travelerLevel;
                        if(travelerLevelInt > 0){
                        travelerExp = (int)(5000*Math.pow(2, travelerLevelInt-2));
                        travelerData+= ";" + EXP_IDENTIFIER + travelerExp;
                        validInputPengembara2 = true;
                    } else{
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    } 
                } else{
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }
            travelerData += ";" + STATUS_IDENTIFIER + travelerStatus;
            }
        

        }
        System.out.println("Pengembara berhasil ditambahkan");
        }
        System.out.println("Data berhasil dimasukkan.");
        System.out.println();
    


        boolean running = true;
        // TODO: Loop menu utama
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Lihat daftar quest");
            System.out.println("2. Lihat daftar pengembara");
            System.out.println("3. Tambah quest");
            System.out.println("4. Tambah pengembara");
            System.out.println("5. Menjalankan quest");
            System.out.println("6. Menyelesaikan quest");
            System.out.println("7. Filter daftar quest");
            System.out.println("8. Filter daftar pengembara");
            System.out.println("9.Tampilkan daftar quest terurut");
            System.out.println("10.Tampilkan daftar pengembara terurut");
            System.out.println("11. Keluar");
            System.out.print("Masukkan pilihan: ");
            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    // TODO: Tampilkan daftar quest
                    System.out.println("Quest yang terdaftar: ");
                    int start = 0;
                    for (int i = 0; i < questData.length(); i++){
                        if (questData.charAt(i)== ';'){
                            if (questData.charAt(start)=='+'){
                                System.out.println("Quest id: " + questData.substring(start+1,i));
                                start = i +1;
                            } else if (questData.charAt(start)==NAME_IDENTIFIER){
                                System.out.println("Nama Quest: "+ questData.substring(start+1,i));
                                start = i +1;
                            } else if (questData.charAt(start)==DESC_IDENTIFIER){
                                System.out.println("Deskripsi Quest: "+ questData.substring(start+1,i));
                                start = i +1;
                            } else if (questData.charAt(start)==REWARD_IDENTIFIER){
                                System.out.println("Reward Quest: "+ questData.substring(start+1,i));
                                start = i +1;
                            } else if (questData.charAt(start)==EXP_IDENTIFIER){
                                System.out.println("Bonus Exp Quest: "+ questData.substring(start+1,i));
                                start = i +1;
                            } else if (questData.charAt(start)==DIFFICULTY_IDENTIFIER){
                                if ((questData.substring(start+1,i)).matches("mudah")){
                                    System.out.println("Tingkat Kesulitan Quest: \u2605");
                                } else if ((questData.substring(start+1,i)).matches("menengah")){
                                    System.out.println("Tingkat Kesulitan Quest: \u2605\u2605");
                                } else if ((questData.substring(start+1,i)).matches("sulit")){
                                    System.out.println("Tingkat Kesulitan Quest: \u2605\u2605\u2605");
                            } start = i +1;
                            } else if (questData.charAt(start)==STATUS_IDENTIFIER){
                                if ((questData.substring(start+1,i)).matches("tersedia")){
                                   System.out.println("Status Quest: "+ questData.substring(start+1,i)+"\ud83d\udfe2");
                                }else if ((questData.substring(start+1,i)).matches("diambil")){
                                   System.out.println("Status Quest: "+ questData.substring(start+1,i)+"\u231b");
                                }else if ((questData.substring(start+1,i)).matches("selesai")){
                                   System.out.println("Status Quest: "+ questData.substring(start+1,i)+"\ud83c\udfc6");
                                }
                                start = i +1;
                            }
                    }
                }
                break;
                case "2":
                    // TODO: Tampilkan daftar pengembara
                    System.out.println("Pengembara yang terdaftar: ");
                    start = 0;
                    for (int i = 0; i < travelerData.length(); i++){
                        if (travelerData.charAt(i)== ';'){
                            if (travelerData.charAt(start)=='+'){
                                System.out.println("ID Pengembara: " + travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==NAME_IDENTIFIER){
                                System.out.println("Nama Pengembara: "+ travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==DESC_IDENTIFIER){
                                System.out.println("Level Pengembara: "+ travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==REWARD_IDENTIFIER){
                                System.out.println("Exp Pengembara: "+ travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==EXP_IDENTIFIER){
                                if ((travelerData.substring(start+1,i)).matches("kosong")){
                                    System.out.println("Status pengembara: "+ travelerData.substring(start+1,i)+"\u2705");
                                } else if((travelerData.substring(start+1,i)).matches("dalam quest")){
                                    System.out.println("Status pengembara: "+ travelerData.substring(start+1,i)+"\u274c");
                                }start = i +1;
                            } 
                    }}break;
                case "3":
                    // TODO: Tambah quest
                    boolean validInput1 = false;
                    boolean validInput2 = false;
                    boolean validInput3 = false;
                    boolean validInput4 = false;
                    boolean validInput5 = false;
                    String questStatus = "tersedia";
                    System.out.println("Quest " + questId);
                     //input nama quest
                    while (!validInput1){

                        System.out.println("Masukkan nama quest (masukkan 'x' atau 'X' untuk kembali): ");
                        String questName = input.nextLine().trim();
                        if (questName.equalsIgnoreCase("x")){
                            break;
                        }else{
                        if (questName.matches("[a-zA-Z0-9\\s]+")){
                            questData += "+"+"Q"+questId + ";" + NAME_IDENTIFIER + questName;
                            validInput1 = true;
                        }else{
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                        }}}
                    if (!validInput1){
                        break;
                    }
                    //input deskripsi quest
                    while (!validInput2){
                        System.out.println("Masukkan deskripsi quest (masukkan 'x' atau 'X' untuk kembali): ");
                        String questDesc = input.nextLine().trim();
                        if (questDesc.equalsIgnoreCase("x")){
                            break;
                        } else {
                            if (questDesc.matches("[a-zA-Z0-9\\s]+")){
                            questData += ";" + DESC_IDENTIFIER + questDesc;
                            validInput2 = true;
                        }else{
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                        }}}
                    if (!validInput2){
                        break;
                    }
                    
                    //input reward quest
                    while (!validInput3){
                        System.out.println("Masukkan reward quest berupa bilangan bulat  (masukkan 'x' atau 'X' untuk kembali): ");
                        String questReward = input.nextLine().trim();
                        if (questReward.equalsIgnoreCase("x")){
                            break;
                        } else{
                            if (questReward.matches("\\d+")){
                                int questRewardInt = Integer.parseInt(questReward);
                                if (questRewardInt >= 0 ){
                                validInput3 = true;
                                questData += ";" + REWARD_IDENTIFIER + questReward;
                                }else{
                                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                                }
                                
                                }else{
                                    System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                                }}}
                                if (!validInput3){
                                    break;
                                }     
                    //input Exp quest  
                    while (!validInput4){
                        System.out.println("Masukkan bonus exp quest berupa bilangan bulat (masukkan 'x' atau 'X' untuk kembali): ");
                        String questExp = input.nextLine().trim();
                        if (questExp.equalsIgnoreCase("x")){
                            break;
                        }else{
                            if (questExp.matches("\\d+")){
                            int questExpInt = Integer.parseInt(questExp);
                            if (questExpInt >= 0 ){
                            validInput4 = true;
                            questData += ";" + EXP_IDENTIFIER + questExp;
                            }else{
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                            }
                            
                        }else{
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                        }}}
                        if (!validInput4){
                            break;
                        }   
                    //input difficulty quest
                    while (!validInput5){
                        System.out.println("Masukkan tingkat kesulitan quest (opsi: mudah, menengah, sulit) (masukkan 'x' atau 'X' untuk kembali): ");
                        String questDiffInput= input.nextLine().trim();
                        if (questDiffInput.equalsIgnoreCase("x")){
                            break;
                        }else{
                            String questDifficulty = questDiffInput.toLowerCase();
                        if (questDifficulty.equals("mudah")||questDifficulty.equals("menengah") || questDifficulty.equals("sulit")){
                            questData += ";"+ DIFFICULTY_IDENTIFIER + questDifficulty;
                            validInput5 = true;
                            }else{
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar");
                            }}}
                            if (!validInput5){
                                break;
                            }
                    questData += ";" + STATUS_IDENTIFIER + questStatus;
                    questId++;
                    System.out.println("Quest berhasil ditambahkan!");
                    break;
                        
 
                case "4":
                    // TODO: Tambah pengembara
                    boolean validInputPengembara1 = false;
                    boolean validInputPengembara2 = false;{
                    while (!validInputPengembara1){
                        System.out.println("Masukkan nama pengembara (masukkan 'x' atau 'X' untuk kembali): ");
                        String travelerName = input.nextLine().trim();
                        if (travelerName.equalsIgnoreCase("x")){
                            break;
                        }else{
                            if (travelerName.matches("[a-zA-Z0-9\\s]+")){
                                travelerData += ";"+"P"+travelerId + ";" + NAME_IDENTIFIER + travelerName; 
                                travelerId++;
                                validInputPengembara1 = true;
                        
                        } else{
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                        }}}
                        if (!validInputPengembara1){
                            break;
                        }
                    
                    while (!validInputPengembara2){
                        System.out.println("Masukkan level pengembara berupa bilangan bulat [1,20] (masukkan 'x' atau 'X' untuk kembali): ");
                        String travelerLevel = input.nextLine().trim();
                        if (travelerLevel.equalsIgnoreCase("x")){
                            break;
                        }else{
                        if (travelerLevel.matches("\\d+")){
                            int travelerLevelInt = Integer.parseInt(travelerLevel);
                            if ((travelerLevelInt >= 1)&&(travelerLevelInt<=20)){
                                travelerData += ";" + LEVEL_IDENTIFIER + travelerLevel;
                                if(travelerLevelInt > 0){
                                travelerExp = (int)(5000*Math.pow(2, travelerLevelInt-2));
                                travelerData+= ";" + EXP_IDENTIFIER + travelerExp;
                                validInputPengembara2 = true;
                                travelerData += ";" + STATUS_IDENTIFIER + travelerStatus;
                                System.out.println("Pengembara berhasil ditambahkan");
                                System.out.println("Data berhasil dimasukkan.");
                                System.out.println();
                                
                            } else{
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            } 
                        } else{
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                        }}
                        if (!validInputPengembara2){
                            break;
                        }
                        } 
                    }
                }

        
                case "5":
                    // TODO: Menjalankan quest
                    while (true) {

                        System.out.println("Masukkan ID Quest yang ingin diambil (atau 'x'/'X' untuk kembali): ");
                        String idQInput = input.nextLine().trim().toUpperCase();

                        if (idQInput.equalsIgnoreCase("x")) {
                            break;
                        }

                        int qDataStart = questData.indexOf("+" + idQInput + ";");
                        if (qDataStart == -1) {
                            System.out.println("Quest tidak ditemukan atau sudah diambil/selesai.");
                            continue;
                        }

                        int qDataEnd = questData.indexOf("+", qDataStart + 1);
                        if (qDataEnd == -1) {
                            qDataEnd = questData.length();
                        }

                        String qDataInput = questData.substring(qDataStart, qDataEnd);

                        // status quest
                        int statusStart = qDataInput.indexOf(STATUS_IDENTIFIER);
                        if (statusStart == -1) {
                            System.out.println("Quest tidak ditemukan atau sudah diambil/selesai.");
                            continue;
                        }

                        int statusEnd = qDataInput.indexOf(';', statusStart + 1);
                        if (statusEnd == -1) {
                            statusEnd = qDataInput.length();
                        }

                        String statusQuest = qDataInput.substring(statusStart + 1, statusEnd);

                        if (!statusQuest.equalsIgnoreCase("tersedia")) {
                            System.out.println("Quest tidak ditemukan atau sudah diambil/selesai.");
                            continue;
                        }

                        // difficulty
                        int diffStart = qDataInput.indexOf(DIFFICULTY_IDENTIFIER);
                        if (diffStart == -1) {
                            System.out.println("Quest tidak ditemukan atau sudah diambil/selesai.");
                            continue;
                        }

                        int diffEnd = qDataInput.indexOf(';', diffStart + 1);
                        if (diffEnd == -1) {
                            diffEnd = qDataInput.length();
                        }

                        String difficulty = qDataInput.substring(diffStart + 1, diffEnd);

                        System.out.println("Masukkan ID pengembara (atau 'x'/'X' untuk kembali): ");
                        String idPInput = input.nextLine().trim().toUpperCase();

                        if (idPInput.equalsIgnoreCase("x")) {
                            continue;
                        }

                        int pDataStart = travelerData.indexOf("+" + idPInput + ";");
                        if (pDataStart == -1) {
                            System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest");
                            continue;
                        }

                        int pDataEnd = travelerData.indexOf("+", pDataStart + 1);
                        if (pDataEnd == -1) {
                            pDataEnd = travelerData.length();
                        }

                        String pDataInput = travelerData.substring(pDataStart, pDataEnd);

                        // level
                        int levelStart = pDataInput.indexOf(LEVEL_IDENTIFIER);
                        if (levelStart == -1) {
                            System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest");
                            continue;
                        }

                        int levelEnd = pDataInput.indexOf(';', levelStart + 1);
                        if (levelEnd == -1) {
                            levelEnd = pDataInput.length();
                        }

                        int level = Integer.parseInt(
                                pDataInput.substring(levelStart + 1, levelEnd)
                        );

                        // status pengembara
                        int statusPStart = pDataInput.indexOf(STATUS_IDENTIFIER);
                        if (statusPStart == -1) {
                            System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest");
                            continue;
                        }

                        int statusPEnd = pDataInput.indexOf(';', statusPStart + 1);
                        if (statusPEnd == -1) {
                            statusPEnd = pDataInput.length();
                        }

                        String statusPengembara =
                                pDataInput.substring(statusPStart + 1, statusPEnd);

                        if (!statusPengembara.equalsIgnoreCase("kosong")) {
                            System.out.println("Pengembara dalam quest.");
                            continue;
                        }


                        // CEK SYARAT LEVEL
                        boolean bolehAmbil = false;

                        if (difficulty.equalsIgnoreCase("sulit") && level >= 16) {
                            bolehAmbil = true;
                        } else if (difficulty.equalsIgnoreCase("menengah") && level >= 6) {
                            bolehAmbil = true;
                        } else if (difficulty.equalsIgnoreCase("mudah")) {
                            bolehAmbil = true;
                        }

                        if (!bolehAmbil) {
                            System.out.println("Pengembara tidak memenuhi persyaratan mengambil quest.");
                            continue;
                        }

                        // UPDATE DATA
                        int qLastSemicolon = qDataInput.lastIndexOf(';');
                        qDataInput = qDataInput.substring(0, qLastSemicolon + 1) + "diambil-" + idPInput + "\u231b";

                        questData = questData.substring(0, qDataStart) + qDataInput + questData.substring(qDataEnd);

                        int pLastSemicolon = pDataInput.lastIndexOf(';');
                        pDataInput = pDataInput.substring(0, pLastSemicolon + 1) + "dalam quest \u274C";

                        travelerData = travelerData.substring(0, pDataStart) + pDataInput + travelerData.substring(pDataEnd);

                        System.out.println("Quest berhasil diambil!");
                        break;
                    }
                    break;

    

                case "6":
                    // TODO: Menyelesaikan quest
                    while (true) {

                        System.out.println("Masukkan ID Quest yang ingin diselesaikan (atau 'x' untuk kembali): ");
                        String idQInput = input.nextLine().trim().toUpperCase();

                        if (idQInput.equalsIgnoreCase("x")) {
                            break;
                        }

                        int qDataStart = questData.indexOf("+" + idQInput + ";");
                        if (qDataStart == -1) {
                            System.out.println("Quest tidak ditemukan.");
                            continue;
                        }

                        int qDataEnd = questData.indexOf("+", qDataStart + 1);
                        if (qDataEnd == -1) {
                            qDataEnd = questData.length();
                        }

                        String qDataInput = questData.substring(qDataStart, qDataEnd);

                        int statusStart = qDataInput.indexOf(STATUS_IDENTIFIER);
                        int statusEnd = qDataInput.indexOf(';', statusStart + 1);
                        if (statusEnd == -1) {
                            statusEnd = qDataInput.length();
                        }
                        String statusQuest = qDataInput.substring(statusStart + 1, statusEnd);

                        if (!statusQuest.startsWith("diambil")) {
                            System.out.println("Quest belum diambil.");
                            continue;
                        }

                        int dashIndex = statusQuest.indexOf("-");
                        String idPengembara = statusQuest.substring(dashIndex + 1).replace("\u231b", "").trim();

                        int rewardStart = qDataInput.indexOf(REWARD_IDENTIFIER);
                        int rewardEnd = qDataInput.indexOf(';', rewardStart + 1);
                        if (rewardEnd == -1) {
                            rewardEnd = qDataInput.length();
                        }
                        int rewardExp = Integer.parseInt(qDataInput.substring(rewardStart + 1, rewardEnd));

                        int qLastSemicolon = qDataInput.lastIndexOf(';');
                        qDataInput = qDataInput.substring(0, qLastSemicolon + 1)+ "selesai\u2705";

                        questData = questData.substring(0, qDataStart)+ qDataInput+ questData.substring(qDataEnd);

                        int pDataStart = travelerData.indexOf("+" + idPengembara + ";");
                        int pDataEnd = travelerData.indexOf("+", pDataStart + 1);
                        if (pDataEnd == -1) {
                            pDataEnd = travelerData.length();
                        }
                        String pDataInput = travelerData.substring(pDataStart, pDataEnd);

                        int levelStart = pDataInput.indexOf(LEVEL_IDENTIFIER);
                        int levelEnd = pDataInput.indexOf(';', levelStart + 1);
                        if (levelEnd == -1) {
                            levelEnd = pDataInput.length();
                        }
                        int level = Integer.parseInt(pDataInput.substring(levelStart + 1, levelEnd));

                        int expStart = pDataInput.indexOf(EXP_IDENTIFIER);
                        int expEnd = pDataInput.indexOf(';', expStart + 1);
                        if (expEnd == -1) {
                            expEnd = pDataInput.length();
                        }
                        int exp = Integer.parseInt(pDataInput.substring(expStart + 1, expEnd));
                        if (exp > 1310720000) {
                            exp = 1310720000;
                        }
                        exp += rewardExp;

                        int levelUp = 5000 * (int)Math.pow(2, level - 1);

                        if (level < 20 && exp >= levelUp) {
                            level++;
                        }

                        if (expEnd == -1) {
                            expEnd = pDataInput.length();
                        }
                        pDataInput = pDataInput.substring(0, expStart + 1) + exp + pDataInput.substring(expEnd);
                        

                        int pLastSemicolon = pDataInput.lastIndexOf(';');
                        pDataInput = pDataInput.substring(0, pLastSemicolon + 1)+ "kosong\u2705";

                        travelerData = travelerData.substring(0, pDataStart)+ pDataInput+ travelerData.substring(pDataEnd);

                        System.out.println("Quest berhasil diselesaikan!");
                        break;
                    }
                    break;
                }}}}
/* 
                case "7":
                    // TODO: Filter daftar quest
                    System.out.println("Belum diimplementasikan");
                    break;
                case "8":
                    // TODO: Filter daftar pengembara
                    System.out.println("Belum diimplementasikan");
                    break;
                case "9":
                    // TODO: Tampilkan daftar quest terurut
                    System.out.println("Belum diimplementasikan");
                    break;
                case "10":
                    // TODO: Tampilkan daftar pengembara terurut
                    System.out.println("Belum diimplementasikan");
                    break;
                case "11":
                    // TODO: Keluar
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
    }


Displaying BurhanQuest.java.
*/