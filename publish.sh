#!/bin/bash
mvn -Drevision="$1" -DskipTests=true package
