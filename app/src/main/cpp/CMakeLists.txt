cmake_minimum_required(VERSION 3.22.1)

project("syntax")

add_library(syntax
        SHARED
        native-lib.c)

find_library(log-lib
        log)

target_link_libraries(syntax
        ${log-lib})
