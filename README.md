# Introduction

MedTime is an Apache UIMA based temporal information extraction system developed by the Mayo Clinic NLP program. It extracts and normalizes TIMEX3-based temporal expressions
from clinical text. MedTime has been adapted from the
open-source temporal tagger, HeidelTime (https://github.com/HeidelTime/heideltime)
but re-engineered toward the clinical domain.

## What's new

Updated temporal expression extraction module for general purpose clinical texts,
which does not require section times or specific text metadata.

## Installation
Java requirement: Java 1.7.

If you are using UNIX, simply:

```
./runCPE.sh
```

In the menu of the CPE window, go to `"File"` -> `"Open CPE Descriptor"` and select `./desc/medtimedesc/collection_process_engine/MedTaggerTimerCPE.xml`.
You may change the `"Input Directory"` and `"Output Dir"` as needed. We suggest to use the default `FileCollectionReader` and `MedTaggerTimerWriter`.

Implementation details can be found in  [project wiki](https://github.com/ymnliu/MedTimer2/wiki/For-developers).

## Versions
MedTime 1.0: http://ohnlp.org/index.php/MedTime_Project_Page

## Citation

If you use MedTime, please kindly consider citing the following papers:

MedTimer 2.0
* Liu S et al. [Correlating Lab Test Results in Clinical Notes with Structured Lab Data: A Case Study in HbA1c and Glucose](https://www.ncbi.nlm.nih.gov/pubmed/28815133). Proc. AMIA Joint Summits on Translational Science, 2017: p221-228.

MedTime 1.0
* Sohn S et al. [Comprehensive temporal information detection from clinical text: medical events, time, and TLINK identification](https://www.ncbi.nlm.nih.gov/pubmed/23558168). J Am Med Inform Assoc. 2013 Sep 1;20(5):836-42.

## Other resources
A review paper of clinical information extraction in NLP:

* Wang Y et al. [Clinical Information Extraction Applications: A Literature Review](http://www.sciencedirect.com/science/article/pii/S1532046417302563). Journal of Biomedical Informatics, 2017

