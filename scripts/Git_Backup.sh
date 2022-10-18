#!/bin/bash
HOME=/home/rajan/Music/backup
BASE=/home/rajan/Music/backup/base
date=$(date '+%Y-%m-%d')
cd $HOME
if [ -d STS ];
then
	rm -r STS;
fi
git clone https://github.com/Rajan-Pandey/STS.git
if [ $? -eq 0 ];
then
	echo "******************************************"
	echo "***********git clone successful***********"
	echo "***********git clone successful**********" >> $BASE/${date}_log.txt
	echo "******************************************"
	tar -zvcf $date.tar.cz STS >> $BASE/${date}_log.txt
	if [ $? -eq 0 ]
	then
		echo "************tar generation successful**************"
		echo "************tar generation successful**************" >> $BASE/${date}_log.txt
		echo "***************************************************"
		mv $date.tar.cz $BASE
	else
		echo "************tar generation failed******************"
		echo "************tar generation failed*****************" >> $BASE/${date}_log.txt
		echo "***************************************************"
		exit 1
	fi
else
echo "***********git clone failed*************"
echo "***********git clone failed*************">> $BASE/${date}_log.txt
echo "****************************************"
fi
