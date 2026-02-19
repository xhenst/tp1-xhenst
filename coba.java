 public class coba {
     public static void main(String[] args) {
                        String questData = "+Q1;QUEST1;1234;135;TERSEDIA;+Q2;QUEST1;1234;135;TERSEDIA;";
                        String qDataInput = "+Q1;QUEST1;1234;135;TERSEDIA;";
 
     


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
                        int qLastSemicolon = qDataInput.lastIndexOf(";");
                        int qSecondLast = qDataInput.lastIndexOf(";", qLastSemicolon-1);
                        String qDataNew = qDataInput.substring(0, qSecondLast) + ";diambil-" + idPInput + "\u231b"+";";
                        questData = questData.replace(qDataInput, qDataNew);


                        int pLastSemicolon = pDataInput.lastIndexOf(';');
                        pDataInput = pDataInput.substring(0, pLastSemicolon - 1) + "dalam quest \u274C;";

                        travelerData = travelerData.substring(0, pDataStart) + pDataInput + travelerData.substring(pDataEnd);


                        System.out.println("Quest berhasil diambil!");
                        break;
                    }
 }}

