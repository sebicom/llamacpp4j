package com.sebicom.llama;


public class Example {

    public  void printSystemInfo() {
        p(LLamaWrap.llama_print_system_info());
    }

    public void initModel() {
        //
         String modelLocation = "/home/mark/ai/oobabooga_linux/text-generation-webui/models/";
//         String modelName = "vicuna-AlekseyKorshuk-7B-GPTQ-4bit-128g.GGML.bin";
        String modelName = "TheBloke_WizardLM-7B-uncensored-GGML/WizardLM-7B-uncensored.ggml.q5_1.bin";


        String mainParams[] = {
                "",
                "--model",modelLocation + modelName,
//                "--prompt",
//                "As an assistant, remember to only answer the question if you know the answer, otherwise say 'I do not know.'."
//                + " Do not make up information or guess. Do not provide information that is not relevant to the question. "
//                + " After responding with an answer, wait for another question. Do not ask yourself questions "
//                + "or use imagine prompts or share prompts.",
                "--no-mmap",
                //"-ngl","0",
                "-s","-1",
                "--memory_f32",
                "-c","1024",
//                "--verbose-prompt",
                "--interactive-first",
                "-r", "User: ",
                "-i",
                "-n","128",
                "--temp","0.95",
                "--threads","6"
        };
//        String mainParams[] = {
//                " ", "--help"
//        };

        LLamaWrap.mainn(mainParams.length, mainParams);


    }

    public void p(String str) {
        System.out.println(str);
    }
}
