# Hadoop-MapReduce
1. Wrote a mapper and reducer to calculate the minimum, maximum, and mean price of the homes in each neighborhood represented in the data set. The data is from a Kaggle competition (https://www.kaggle.com/c/house-prices-advanced-regression-techniques/data).  The output of looks like this:

Blmngtn	159895.0
Blmngtn	194870.88
Blmngtn	264561.0
Blueste	124000.0
Blueste	137500.0
Blueste	151000.0
BrDale	83000.0

2. Wrote a MapReduce program to calculate the total number of sent emails per email domain for a given person in the Enron data set.  The output of final solution must be separated into 2 different output directories (part-r-00000 and part-r-00001), where the first output directory contains email domains starting with the letters a-m and the second output directory contains email domains starting with the letters n-z.   The data is excerpted from the infamous Enron email corpus (https://en.wikipedia.org/wiki/Enron_Corpus).  

Below is an example of output should look like, where the domain is the output key and the output value is the total number of emails sent to that domain.

$ cat part-r-00000
2onesource.com	3
aol.com	99
cityofnapa.org	8
enron.com	2
gte.net	9
hotmail.com	31
ix.netcom.com	15
lycosmail.com	8
mindspring.com	10

$ cat part-r-00001
nextera-pcg.com	2
provdiv.ttm.bg	1
rwblaw.com	8
sbu.edu	8
sirius.com	14
sprynet.com	4
tribune.com	11
usa.net	2
worldnet.att.net	8
yahoo.com	12

