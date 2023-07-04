# :> llamacpp4j

This project is using the [llama.cpp](https://github.com/ggerganov/llama.cpp) to interact with an llm via Java.
Java classes were built using the SWIG project via [llama.swig](https://github.com/bnikolic/llama.swig).

## Setup

#### All files referenced below are found in the /src/main/resources directory

**1.** Add the java library to your local maven repo

    mvn install:install-file -Dfile=src/main/resources/LLamaWrap.jar -DgroupId=com.sebicom -DartifactId=llama -Dversion=0.48 -Dpackaging=jar


**2.** For Linux, add the native c/c++ libraries, libllama.so & libllama_jwrap.so, to:
 
    /usr/java/packages/lib

**3.** Compile and build the application jar:

    mvn clean compile assembly:single


**4.** Execute the sh script:

    sh start-llama4j.sh


### Example Run:
`
(base) mark@mark-precision-7530:~/IdeaProjects/llamajwrapper$ sh start-llama4j.sh
AVX = 1 | AVX2 = 1 | AVX512 = 0 | AVX512_VBMI = 0 | AVX512_VNNI = 0 | FMA = 1 | NEON = 0 | ARM_FMA = 0 | F16C = 1 | FP16_VA = 0 | WASM_SIMD = 0 | BLAS = 0 | SSE3 = 1 | VSX = 0 |
mainn: build = 491 (a638ea3)
mainn: seed  = 1688477545
llama.cpp: loading model from /home/mark/ai/oobabooga_linux/text-generation-webui/models/TheBloke_WizardLM-7B-uncensored-GGML/WizardLM-7B-uncensored.ggml.q5_1.bin
llama_model_load_internal: format     = ggjt v1 (latest)
llama_model_load_internal: n_vocab    = 32001
llama_model_load_internal: n_ctx      = 1024
llama_model_load_internal: n_embd     = 4096
llama_model_load_internal: n_mult     = 256
llama_model_load_internal: n_head     = 32
llama_model_load_internal: n_layer    = 32
llama_model_load_internal: n_rot      = 128
llama_model_load_internal: ftype      = 9 (mostly Q5_1)
llama_model_load_internal: n_ff       = 11008
llama_model_load_internal: n_parts    = 1
llama_model_load_internal: model size = 7B
llama_model_load_internal: ggml ctx size = 4936282.20 KB
llama_model_load_internal: mem required  = 6612.59 MB (+ 2052.00 MB per state)
....................................................................................................
llama_init_from_file: kv self size  = 1024.00 MB

system_info: n_threads = 6 / 12 | AVX = 1 | AVX2 = 1 | AVX512 = 0 | AVX512_VBMI = 0 | AVX512_VNNI = 0 | FMA = 1 | NEON = 0 | ARM_FMA = 0 | F16C = 1 | FP16_VA = 0 | WASM_SIMD = 0 | BLAS = 0 | SSE3 = 1 | VSX = 0 |
mainn: interactive mode on.
Reverse prompt: 'User: '
sampling: repeat_last_n = 64, repeat_penalty = 1.100000, presence_penalty = 0.000000, frequency_penalty = 0.000000, top_k = 40, tfs_z = 1.000000, top_p = 0.950000, typical_p = 1.000000, temp = 0.950000, mirostat = 0, mirostat_lr = 0.100000, mirostat_ent = 5.000000
generate: n_ctx = 1024, n_batch = 512, n_predict = 128, n_keep = 0


== Running in interactive mode. ==
- Press Ctrl+C to interject at any time.
- Press Return to return control to LLaMa.
- If you want to submit another line, end your input in '\'.

Hello\
I'm a tool for helping people find information. What can I help you with today?\
User: Summarize for me a list of the greatest impacts AI will bring to humanity.\                         
AI: Certainly! Here are some of the potential benefits and challenges of AI:\
Benefits:
1. Increased efficiency and productivity in many industries, particularly those that involve complex data analysis or pattern recognition.
2. Improved healthcare outcomes through better diagnosis and treatment plans.
3. Enhanced accessibility for people with disabilities through assistive techn
   ologies.
4. Greater financial inclusion and economic opportunities for underrepresented groups.
5. Potential for reduced carbon emissions and increased sustainability in transportation and energy production.\

Challenges:
1. Job displacement and economic disruption as AI replaces human workers in certain industries.
2. Privacy concerns as AI systems collect and analyze large amounts of personal data.
3. Biases and errors in AI algorithms that could perpetuate existing inequalities or exacerbate them.
4. The need for ongoing education and retraining to keep
   up with the rapidly evolving field of AI.
5. potential for AI-enabled weapons and surveillance systems to be used for harmful purposes.\
   I hope that helps! Let me know if you have any other questions.\
   User: 

`