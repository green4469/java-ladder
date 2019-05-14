# 계산기 TDD 예제

## To-do-list

- ~~문자열을 구분자를 기준으로 분리해라~~
    - "" -> null
    - "1,2,3" -> {1, 2, 3}
    - "1,2:3" -> {1, 2, 3}
- ~~커스텀 구분자를 지정할 수 있다.~~
    - "//;\n1;2;3" -> {1, 2, 3}
- ~~숫자 배열을 더해라~~
    - "1,2,3"
    - "1,2:3"
    - "//;\n1;2;3"
- ~~음수를 받으면 RuntimeException 에러를 throw 한다.~~
- ~~문자열 구분 메소드 리팩토링 필요~~

# 사다리 게임

## To-do-list
- ~~라인이 겹치면 안 된다. (isConsecutive())~~
    - true, true -> true
    - true, false -> false
    - false, true -> false
- ~~라인은 위치를 받았을 때 진행할 방향을 알려줘야 한다.~~
    - 0, {true, false} -> RIGHT
    - 1, {true, false} -> LEFT
    - 0, {false, true} -> STRAIGHT
- ~~사다리 타기를 진행해서 결과를 얻는다.~~
    - lines, {"pobi" : 0, "crong" : 1, "honux": 2} -> {"pobi" : 2, "crong" :1, "honux" : 0}
