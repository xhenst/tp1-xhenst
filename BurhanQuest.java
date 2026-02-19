import java.util.Scanner;

public class BurhanQuest {
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
            questData += ";" + STATUS_IDENTIFIER + questStatus+";";
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
            travelerData += ";" + STATUS_IDENTIFIER + travelerStatus+';';
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
            System.out.println("11. Papan Statistik Guild");
            System.out.println("12. Keluar");
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
                            }else if (questData.charAt(start)==STATUS_IDENTIFIER){
                                if ((questData.substring(start+1,i)).startsWith("tersedia")){
                                   System.out.println("Status Quest: "+ questData.substring(start+1,i)+"\ud83d\udfe2");
                                }else if ((questData.substring(start+1,i)).contains("diambil")){
                                   System.out.println("Status Quest: "+ questData.substring(start+1,i)+"\u231b");
                                }else if ((questData.substring(start+1,i)).startsWith("selesai")){
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
                            } else if (travelerData.charAt(start)==LEVEL_IDENTIFIER){
                                System.out.println("Level Pengembara: "+ travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==EXP_IDENTIFIER){
                                System.out.println("Exp Pengembara: "+ travelerData.substring(start+1,i));
                                start = i +1;
                            } else if (travelerData.charAt(start)==STATUS_IDENTIFIER){
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
                        System.out.println("Pengembara " + travelerId);
                        System.out.println("Masukkan nama pengembara (masukkan 'x' atau 'X' untuk kembali): ");
                        String travelerName = input.nextLine().trim();
                        if (travelerName.equalsIgnoreCase("x")){
                            break;
                        }else{
                            if (travelerName.matches("[a-zA-Z0-9\\s]+")){
                                travelerData += "+"+"P"+travelerId + ";" + NAME_IDENTIFIER + travelerName; 
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
                                travelerData += ";" + STATUS_IDENTIFIER + travelerStatus+";";
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
                break;

        
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

                        int qLastSemicolon = qDataInput.lastIndexOf(";");
                        int qSecondLast = qDataInput.lastIndexOf(";", qLastSemicolon-1);
                        String qDataNew = qDataInput.substring(0, qSecondLast) + ";"+STATUS_IDENTIFIER+"diambil-" + idPInput + "\u231b"+";";
                        questData = questData.replace(qDataInput, qDataNew);


                        int pLastSemicolon = pDataInput.lastIndexOf(';');
                        int pSecondLast = pDataInput.lastIndexOf(";", pLastSemicolon-1);
                        String pDataNew = pDataInput.substring(0, pSecondLast) + ";"+STATUS_IDENTIFIER+"dalam quest"+";";
                        travelerData = travelerData.replace(pDataInput, pDataNew);
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
                        if (statusStart == -1){
                            System.out.println("Quest tidak ditemukan.");
                        }
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
                        if (rewardStart==-1){
                            System.out.println("Quest tidak ditemukan.");
                        }
                        int rewardEnd = qDataInput.indexOf(';', rewardStart + 1);
                        if (rewardEnd == -1) {
                            rewardEnd = qDataInput.length();
                        }
                        int rewardExp = Integer.parseInt(qDataInput.substring(rewardStart + 1, rewardEnd));

                        int qLastSemicolon = qDataInput.lastIndexOf(";");
                        int qSecondLast = qDataInput.lastIndexOf(";", qLastSemicolon-1);
                        String qDataNew = qDataInput.substring(0, qSecondLast) + ";"+STATUS_IDENTIFIER+"selesai\u2705"+";";
                        questData = questData.replace(qDataInput, qDataNew);


                        int pDataStart = travelerData.indexOf("+" + idPengembara + ";");
                        if (pDataStart == -1) {
                            System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest");
                            continue;
                        }
                        int pDataEnd = travelerData.indexOf("+", pDataStart + 1);
                        if (pDataEnd == -1) {
                            pDataEnd = travelerData.length();
                        }
                        String pDataInput = travelerData.substring(pDataStart, pDataEnd);

                        int levelStart = pDataInput.indexOf(LEVEL_IDENTIFIER);
                        if (levelStart == -1) {
                            System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest");
                            continue;}                        
                        int levelEnd = pDataInput.indexOf(';', levelStart + 1);
                        if (levelEnd == -1) {
                            levelEnd = pDataInput.length();
                        }
                        int level = Integer.parseInt(pDataInput.substring(levelStart + 1, levelEnd));

                        int expStart = pDataInput.indexOf(EXP_IDENTIFIER);
                        if (expStart == -1) {
                            expStart = pDataInput.length();
                        }                       
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

                        pDataInput = pDataInput.substring(0, expStart + 1) + exp + pDataInput.substring(expEnd);
                        

                        int pLastSemicolon = pDataInput.lastIndexOf(';');
                        int pSecondLast = pDataInput.lastIndexOf(";", pLastSemicolon-1);
                        String pDataNew = pDataInput.substring(0, pSecondLast)+ STATUS_IDENTIFIER+"kosong\u2705"+';';
                        travelerData = travelerData.replace(pDataInput, pDataNew);
                        System.out.println("Quest berhasil diselesaikan!");
                        break;
                    }
                    break;
                

                case "7":
                    // TODO: Filter daftar quest        
                    while (true) {                    
                    System.out.println("Filter daftar quest");
                    System.out.println("""
                            1. Filter berdasarkan status
                            2. Filter berdasarkan tingkat kesulitan
                            X. Kembali ke menu utama
                            """);
                    String filterChoice = input.nextLine().trim();
                    if (((filterChoice.equalsIgnoreCase("1"))||filterChoice.equalsIgnoreCase("2")||filterChoice.equalsIgnoreCase("x"))){
                    if (filterChoice.equalsIgnoreCase("x")){
                        break;
                    }else if (filterChoice.equals("1")){
                        System.out.println("Masukkan status quest yang ingin di dafilter (tersedia/diambil/sekesai");
                        String questFilterStatus = input.nextLine().trim();
                        if (((questFilterStatus.equalsIgnoreCase("tersedia"))||(questFilterStatus.equalsIgnoreCase("diambil"))||(questFilterStatus.equalsIgnoreCase("selesai")))){
                                System.err.println("Daftar quest terfilter: "); 
                                int i = 0;
                                while (i<questData.length()){
                                    if (questData.charAt(i)=='+'){
                                            int startDataFilter = i;
                                            int endDataFilter = questData.indexOf('+', i+1);
                                            if (endDataFilter == -1){
                                                endDataFilter = questData.length();
                                            }
                                            String dataQuestFilter = questData.substring(startDataFilter,endDataFilter);

                                            if (dataQuestFilter.contains("@"+questFilterStatus)){
                                                int startPrint = 0;
                                                for (int j = 0; j < dataQuestFilter.length(); j++){
                                                    if (dataQuestFilter.charAt(j)== ';'){
                                                        if (dataQuestFilter.charAt(startPrint)=='+'){
                                                            System.out.println("Quest id: " + dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==NAME_IDENTIFIER){
                                                            System.out.println("Nama Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==DESC_IDENTIFIER){
                                                            System.out.println("Deskripsi Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==REWARD_IDENTIFIER){
                                                            System.out.println("Reward Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==EXP_IDENTIFIER){
                                                            System.out.println("Bonus Exp Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==DIFFICULTY_IDENTIFIER){
                                                            if ((dataQuestFilter.substring(startPrint+1,j)).matches("mudah")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605");
                                                            } else if ((dataQuestFilter.substring(startPrint+1,j)).matches("menengah")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605\u2605");
                                                            } else if ((dataQuestFilter.substring(startPrint+1,j)).matches("sulit")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605\u2605\u2605");
                                                        } startPrint = j +1;
                                                        }else if (dataQuestFilter.charAt(startPrint)==STATUS_IDENTIFIER){
                                                            if ((dataQuestFilter.substring(startPrint+1,j)).startsWith("tersedia")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\ud83d\udfe2");
                                                            }else if ((dataQuestFilter.substring(startPrint+1,j)).contains("diambil")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\u231b");
                                                            }else if ((dataQuestFilter.substring(startPrint+1,j)).startsWith("selesai")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\ud83c\udfc6");
                                                            }
                                                            startPrint = j +1;
                                                            
                                                        }
                                                    }
                                                }
                                                i = endDataFilter;        
                                            }else{
                                                i++;
                                        }
                                }                          
                    }
               
            }
            }else if (filterChoice.equals("2")){
                        System.out.println("Masukkan tingkat kesulitan quest yang ingin difilter (mudah/menengah/sulit), masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                        String questFilterStatus = input.nextLine().trim();
                        if (((questFilterStatus.equalsIgnoreCase("mudah"))||(questFilterStatus.equalsIgnoreCase("menengah"))||(questFilterStatus.equalsIgnoreCase("sulit")))){
                                System.err.println("Daftar quest terfilter: "); 
                                int i = 0;
                                while (i<questData.length()){
                                    if (questData.charAt(i)=='+'){
                                            int startDataFilter = i;
                                            int endDataFilter = questData.indexOf('+', i+1);
                                            if (endDataFilter == -1){
                                                endDataFilter = questData.length();
                                            }
                                            String dataQuestFilter = questData.substring(startDataFilter,endDataFilter);

                                            if (dataQuestFilter.contains(DIFFICULTY_IDENTIFIER+questFilterStatus)){
                                                int startPrint = 0;
                                                for (int j = 0; j < dataQuestFilter.length(); j++){
                                                    if (dataQuestFilter.charAt(j)== ';'){
                                                        if (dataQuestFilter.charAt(startPrint)=='+'){
                                                            System.out.println("Quest id: " + dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==NAME_IDENTIFIER){
                                                            System.out.println("Nama Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==DESC_IDENTIFIER){
                                                            System.out.println("Deskripsi Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==REWARD_IDENTIFIER){
                                                            System.out.println("Reward Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==EXP_IDENTIFIER){
                                                            System.out.println("Bonus Exp Quest: "+ dataQuestFilter.substring(startPrint+1,j));
                                                            startPrint = j +1;
                                                        } else if (dataQuestFilter.charAt(startPrint)==DIFFICULTY_IDENTIFIER){
                                                            if ((dataQuestFilter.substring(startPrint+1,j)).matches("mudah")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605");
                                                            } else if ((dataQuestFilter.substring(startPrint+1,j)).matches("menengah")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605\u2605");
                                                            } else if ((dataQuestFilter.substring(startPrint+1,j)).matches("sulit")){
                                                                System.out.println("Tingkat Kesulitan Quest: \u2605\u2605\u2605");
                                                        } startPrint = j +1;
                                                        }else if (dataQuestFilter.charAt(startPrint)==STATUS_IDENTIFIER){
                                                            if ((dataQuestFilter.substring(startPrint+1,j)).startsWith("tersedia")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\ud83d\udfe2");
                                                            }else if ((dataQuestFilter.substring(startPrint+1,j)).contains("diambil")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\u231b");
                                                            }else if ((dataQuestFilter.substring(startPrint+1,j)).startsWith("selesai")){
                                                            System.out.println("Status Quest: "+ dataQuestFilter.substring(startPrint+1,j)+"\ud83c\udfc6");
                                                            }
                                                            startPrint = j +1;
                                                            
                                                        }
                                                    }
                                                }
                                                i = endDataFilter;        
                                            }else
                                                {
                                                i++;
                                                    }
                                                }}}}break;
                                                }}break;
                case "8":
                    // TODO: Filter daftar pengembara
                    while (true) {                    
                    System.out.println("Filter daftar pengembara");
                    System.out.println("""
                            1. Filter berdasarkan status
                            2. Filter berdasarkan rentang level
                            X. Kembali ke menu utama
                            """);
                    String filterChoice = input.nextLine().trim();
                    if (((filterChoice.equalsIgnoreCase("1"))||filterChoice.equalsIgnoreCase("2")||filterChoice.equalsIgnoreCase("3")||filterChoice.equalsIgnoreCase("x"))){
                    if (filterChoice.equalsIgnoreCase("x")){
                        break;
                    }else if (filterChoice.equals("1")){
                        System.out.println("Masukkan status pengembara yang ingin di dafilter (kosong/dalam quest)");
                        String questFilterStatus = input.nextLine().trim();
                        if (((questFilterStatus.equalsIgnoreCase("kosong")))){
                                System.err.println("Daftar pengembara terfilter: "); 
                                int i = 0;
                                while (i<travelerData.length()){
                                    if (travelerData.charAt(i)=='+'){
                                            int startDataFilter = i;
                                            int endDataFilter = questData.indexOf('+', i+1);
                                            if (endDataFilter == -1){
                                                endDataFilter = questData.length();
                                            }
                                            String dataQuestFilter = questData.substring(startDataFilter,endDataFilter);

                                            if (dataQuestFilter.contains("@"+questFilterStatus)){
                                                    start = 0;
                                                    for (int j = 0; j < travelerData.length(); j++){
                                                        if (travelerData.charAt(j)== ';'){
                                                            if (travelerData.charAt(start)=='+'){
                                                                System.out.println("ID Pengembara: " + travelerData.substring(start+1,j));
                                                                start = j +1;
                                                            } else if (travelerData.charAt(start)==NAME_IDENTIFIER){
                                                                System.out.println("Nama Pengembara: "+ travelerData.substring(start+1,j));
                                                                start = j +1;
                                                            } else if (travelerData.charAt(start)==DESC_IDENTIFIER){
                                                                System.out.println("Level Pengembara: "+ travelerData.substring(start+1,j));
                                                                start = j +1;
                                                            } else if (travelerData.charAt(start)==REWARD_IDENTIFIER){
                                                                System.out.println("Exp Pengembara: "+ travelerData.substring(start+1,j));
                                                                start = j +1;
                                                            } else if (travelerData.charAt(start)==EXP_IDENTIFIER){
                                                                if ((travelerData.substring(start+1,j)).matches("kosong")){
                                                                    System.out.println("Status pengembara: "+ travelerData.substring(start+1,j)+"\u2705");
                                                                } else if((travelerData.substring(start+1,j)).matches("dalam quest")){
                                                                    System.out.println("Status pengembara: "+ travelerData.substring(start+1,j)+"\u274c");
                                                                }start = j +1;
                                                                                            
                                                                }}}
                                                                    i = endDataFilter;        
                                                                }else{
                                                                    i++;
                                                                }
                                                            }                          
                    }
               
            }
            }else if (filterChoice.equals("2")){

                    System.out.println("Masukkan rentang level (inklusif) yang ingin difilter, masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                    System.out.println("Masukkan batas bawah: ");
                    String batasBawah = input.nextLine();
                    if (batasBawah.equalsIgnoreCase("x")){
                        break;
                    }
                    if (!(batasBawah.matches("\\d+"))){
                        System.out.println("Input harus angka.");
                        continue;
                    }
                    int batasBawahInt = Integer.parseInt(batasBawah);
                    if((batasBawahInt<1)||(batasBawahInt>20)){
                        System.out.println("Batas antara 1-20");
                        continue;
                    }

                
                    System.out.println("Masukkan batas atas: ");
                    String batasAtas = input.nextLine();

                    if (batasAtas.equalsIgnoreCase("x")){
                        break;
                    } if (!(batasAtas.matches("\\d+"))){
                        System.out.println("Input harus angka");
                        continue;
                    }
                    int batasAtasInt = Integer.parseInt(batasAtas);

                    if (batasAtasInt>20 || batasAtasInt < batasBawahInt){
                        System.err.println("Input tidak valid");
                        continue;
                    }
                    int i = 0;
                    while(i<travelerData.length()){
                        int startData = i;
                        int endData = travelerData.indexOf('+', i+1);
                        if(endData == -1){
                            endData = travelerData.length();
                        }
                        String dataTraveFilter = travelerData.substring(startData, endData);
                        int levelStart = travelerData.indexOf(LEVEL_IDENTIFIER);
                        int levelEnd = travelerData.indexOf(';', levelStart + 1);

                        int level = Integer.parseInt(dataTraveFilter.substring(levelStart + 1, levelEnd));

                        if (level>= batasBawahInt && level<=batasAtasInt){
                            start = 0;
                            for (int k = 0; k < travelerData.length();k++){
                                if (travelerData.charAt(k)== ';'){
                                    if (travelerData.charAt(start)=='+'){
                                        System.out.println("ID Pengembara: " + travelerData.substring(start+1,k));
                                        start = k +1;
                                    } else if (travelerData.charAt(start)==NAME_IDENTIFIER){
                                        System.out.println("Nama Pengembara: "+ travelerData.substring(start+1,k));
                                        start = k +1;
                                    } else if (travelerData.charAt(start)==DESC_IDENTIFIER){
                                        System.out.println("Level Pengembara: "+ travelerData.substring(start+1,k));
                                        start = k +1;
                                    } else if (travelerData.charAt(start)==REWARD_IDENTIFIER){
                                        System.out.println("Exp Pengembara: "+ travelerData.substring(start+1,k));
                                        start = k +1;
                                    } else if (travelerData.charAt(start)==EXP_IDENTIFIER){
                                        if ((travelerData.substring(start+1,k)).matches("kosong")){
                                            System.out.println("Status pengembara: "+ travelerData.substring(start+1,k)+"\u2705");
                                        } else if((travelerData.substring(start+1,k)).matches("dalam quest")){
                                            System.out.println("Status pengembara: "+ travelerData.substring(start+1,k)+"\u274c");
                                        }start = k +1;
                                    } 
                            }
                        }i = endData;
                                }
                                else{
                                    i++;
                                }
                            }
            } else{
                System.out.println("Pilihan tidak valid.");
            }
                    }break;
                }break;

                case "9":
                    // TODO: Tampilkan daftar quest terurut
                while (true){
                    System.out.println("Urutkan quest berdasarkan:");
                    System.out.println("1. Tingkat kesulitan");
                    System.out.println("2. Reward");
                    System.out.println("3. Bonus Exp");
                    System.out.println("X. Kembali");

                    String sortChoice = input.nextLine().trim();

                    if(sortChoice.equalsIgnoreCase("x")) {
                        break;
                    }
                    System.out.println("Urutan (asc/desc): ");
                    String order = input.nextLine().trim().toLowerCase();

                    if(!(order.equals("asc") || order.equals("desc"))){
                        System.out.println("Input order tidak valid.");
                        continue;
                    }

                    String tempData = questData; 

                    while(tempData.contains("+Q")){
                        int bestStart = -1;
                        int bestEnd = -1;                                       
                        int bestValue;

                        if(order.equals("asc")){
                            bestValue = Integer.MAX_VALUE;
                        }else{
                            bestValue = Integer.MIN_VALUE;
                        }

                        int i = 0;

                        while(i < tempData.length()){
                            if(tempData.charAt(i)=='+'){

                                start = i;
                                int end = tempData.indexOf('+', i+1);
                                if(end==-1) {
                                    end = tempData.length();
                                }
                                String oneQuest = tempData.substring(start,end);

                                int value = 0;

                                if(sortChoice.equals("1")){
                                    int diffStart = oneQuest.indexOf(DIFFICULTY_IDENTIFIER);
                                    int diffEnd = oneQuest.indexOf(';', diffStart+1);
                                    String diff = oneQuest.substring(diffStart+1,diffEnd);

                                    if(diff.equals("mudah")) {
                                    value=1;}
                                    else if(diff.equals("menengah")) {
                                        value=2;}
                                    else {
                                        value=3;
                                }}

                                else if(sortChoice.equals("2")){
                                    int rewardStart = oneQuest.indexOf(REWARD_IDENTIFIER);
                                    int rewardEnd = oneQuest.indexOf(';', rewardStart+1);
                                    value = Integer.parseInt(oneQuest.substring(rewardStart+1,rewardEnd));
                                }
                                else if(choice.equals("3")){ 

                                    int expStart = oneQuest.indexOf(EXP_IDENTIFIER);
                                    int expEnd = oneQuest.indexOf(';', expStart+1);
                                    value = Integer.parseInt(oneQuest.substring(expStart+1, expEnd));

                                }

                                if(order.equals("asc")){
                                    if(value < bestValue){
                                        bestValue = value;
                                        bestStart = start;
                                        bestEnd = end;
                                    }
                                }else{
                                    if(value > bestValue){
                                        bestValue = value;
                                        bestStart = start;
                                        bestEnd = end;
                                    }
                                }

                                i = end;
                            }else i++;
                        }


                        String bestQuest = tempData.substring(bestStart,bestEnd);

                        int startPrint=0;
                        for(int j=0;j<bestQuest.length();j++){
                            if(bestQuest.charAt(j)==';'){
                                char c = bestQuest.charAt(startPrint);

                                if(c=='+'){
                                    System.out.println("Quest ID: "+bestQuest.substring(startPrint+1,j));}
                                else if(c==NAME_IDENTIFIER){
                                    System.out.println("Nama: "+bestQuest.substring(startPrint+1,j));}
                                else if(c==DESC_IDENTIFIER){
                                    System.out.println("Deskripsi: "+bestQuest.substring(startPrint+1,j));}
                                else if(c==REWARD_IDENTIFIER){
                                    System.out.println("Reward: "+bestQuest.substring(startPrint+1,j));}
                                else if(c==DIFFICULTY_IDENTIFIER){
                                    System.out.println("Difficulty: "+bestQuest.substring(startPrint+1,j));}
                                else if(c==STATUS_IDENTIFIER){
                                    System.out.println("Status: "+bestQuest.substring(startPrint+1,j));}

                                startPrint=j+1;
                            }
                        }
                        tempData = tempData.substring(0,bestStart) + tempData.substring(bestEnd);
                    }
                }
                break;
            

                case "10":
                    // TODO: Tampilkan daftar pengembara terurut

                while(true){
                    System.out.println("Urutkan pengembara berdasarkan:");
                    System.out.println("1. Nama");
                    System.out.println("2. Level");
                    System.out.println("3. EXP");
                    System.out.println("X. Kembali");

                    choice = input.nextLine().trim();

                    if(choice.equalsIgnoreCase("x")) {
                        break;
                    }
                    System.out.println("Urutan (asc/desc): ");
                    String order = input.nextLine().trim().toLowerCase();

                    if(!(order.equals("asc") || order.equals("desc"))){
                        System.out.println("Input order tidak valid.");
                        continue;
                    }

                    String tempData = travelerData;

                    while(tempData.contains("+A")){
                        int bestStart=-1;
                        int bestEnd=-1;

                        String bestString="";
                        int bestNumber;
                        if(order.equals("asc")){
                            bestNumber = Integer.MAX_VALUE;
                        }else{
                            bestNumber = Integer.MIN_VALUE;
                        }


                        int i=0;

                        while(i<tempData.length()){
                            if(tempData.charAt(i)=='+'){

                                start=i;
                                int end=tempData.indexOf('+',i+1);
                                if(end==-1) end=tempData.length();

                                String one=tempData.substring(start,end);

                                // ===== SORT NAMA =====
                                if(choice.equals("1")){
                                    int nameStart = one.indexOf(NAME_IDENTIFIER);
                                    int nameEnd = one.indexOf(';',nameStart+1);
                                    String name = one.substring(nameStart+1,nameEnd).toLowerCase();

                                    if(bestString==null){
                                        bestString=name;
                                        bestStart=start;
                                        bestEnd=end;
                                    }else{
                                        if(order.equals("asc")){
                                            if(name.compareTo(bestString)<0){
                                                bestString=name;
                                                bestStart=start;
                                                bestEnd=end;
                                            }
                                        }else{
                                            if(name.compareTo(bestString)>0){
                                                bestString=name;
                                                bestStart=start;
                                                bestEnd=end;
                                            }
                                        }
                                    }
                                }

                                else if(choice.equals("2")){
                                    int levelStart = one.indexOf(LEVEL_IDENTIFIER);
                                    int levelEnd = one.indexOf(';',levelStart+1);
                                    int level = Integer.parseInt(one.substring(levelStart+1,levelEnd));

                                    if(order.equals("asc")){
                                        if(level < bestNumber){
                                            bestNumber=level;
                                            bestStart=start;
                                            bestEnd=end;
                                        }
                                    }else{
                                        if(level > bestNumber){
                                            bestNumber=level;
                                            bestStart=start;
                                            bestEnd=end;
                                        }
                                    }
                                }
                                else if(choice.equals("3")){ 

                                int expStart = one.indexOf(EXP_IDENTIFIER);
                                int expEnd = one.indexOf(';', expStart+1);
                                int exp = Integer.parseInt(one.substring(expStart+1, expEnd));

                                if(order.equals("asc")){
                                    if(exp < bestNumber){
                                        bestNumber = exp;
                                        bestStart = start;
                                        bestEnd = end;
                                    }
                                }else{
                                    if(exp > bestNumber){
                                        bestNumber = exp;
                                        bestStart = start;
                                        bestEnd = end;
                                    }
                                }
                            }


                                i=end;
                            }else i++;
                        }


                        String best = tempData.substring(bestStart,bestEnd);

                        int startPrint=0;
                        for(int j=0;j<best.length();j++){
                            if(best.charAt(j)==';'){
                                if(best.charAt(startPrint)=='+'){
                                    System.out.println("ID: "+best.substring(startPrint+1,j));}
                                else if(best.charAt(startPrint)==NAME_IDENTIFIER)
                                    System.out.println("Nama: "+best.substring(startPrint+1,j));
                                else if(best.charAt(startPrint)==LEVEL_IDENTIFIER)
                                    System.out.println("Level: "+best.substring(startPrint+1,j));

                                startPrint=j+1;
                            }
                        }

                        tempData=tempData.substring(0,bestStart)+tempData.substring(bestEnd);
                    }
                }
                break;
                case "11":
                    int totalPengembara = 0;
                    int kosong = 0;
                    int dalamQuest = 0;

                    int i = 0;
                    while(i < travelerData.length()){

                        if(travelerData.charAt(i)=='+'){

                            totalPengembara++;

                            start = i;
                            int end = travelerData.indexOf('+', i+1);
                            if(end==-1) {
                                end = travelerData.length();
                            }
                            String oneTraveler = travelerData.substring(start,end);

                            int statusStart = oneTraveler.indexOf(STATUS_IDENTIFIER);
                            int statusEnd = oneTraveler.indexOf(';', statusStart+1);
                            String status = oneTraveler.substring(statusStart+1,statusEnd).toLowerCase();

                            if(status.equals("kosong"))
                                kosong++;
                            else if(status.equals("dalam quest"))
                                dalamQuest++;

                            i = end;
                        }
                        else i++;
                    }
                        int totalQuest = 0;
                        int tersedia = 0;
                        int diambil = 0;
                        int selesai = 0;

                        i = 0;
                        while(i < questData.length()){

                            if(questData.charAt(i)=='+'){

                                totalQuest++;

                                start = i;
                                int end = questData.indexOf('+', i+1);
                                if(end==-1) {
                                    end = questData.length();
                                }
                                String oneQuest = questData.substring(start,end);

                                int statusStart = oneQuest.indexOf(STATUS_IDENTIFIER);
                                int statusEnd = oneQuest.indexOf(';', statusStart+1);
                                String status = oneQuest.substring(statusStart+1,statusEnd).toLowerCase();

                                if(status.equals("tersedia")){
                                    tersedia++;}
                                else if(status.equals("diambil")){
                                    diambil++;}
                                else if(status.equals("selesai")){
                                    selesai++;}

                                i = end;
                            }
                            else i++;
                        }
                            System.out.println("Total Pengembara : " + totalPengembara);
                            System.out.println("Pengembara kosong  : " + kosong);
                            System.out.println("Sedang quest     : " + dalamQuest);
                            System.out.println();

                            System.out.println("Total Quest      : " + totalQuest);
                            System.out.println("Quest tersedia   : " + tersedia);
                            System.out.println("Quest diambil    : " + diambil);
                            System.out.println("Quest selesai    : " + selesai);
                            break;

                case "12":
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
