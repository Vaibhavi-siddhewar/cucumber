Feature: swaglab every username login

Scenario Outline:verify user can login using each accepted username and password

Given launch swaglab website
When enter username as <uname> and password as <pass>
Then swaglab login should be successfull

  Examples:
    | uname                   | pass         |
    | standard_user           | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
    | error_user              | secret_sauce |
    | visual_user             | secret_sauce |
    | locked_out_user         | secret_sauce |
