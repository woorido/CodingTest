##문자열

###문자열 내 문자를 가져오는 방법
1. String.charAt(int index) : index에 있는 문자를 char 형식으로 반환, 특정 몇 개의 문자만 필요할 때 사용
2. String.toCharArray() : 모든 문자가 들어있는 char[] 형식의 데이터 반환, 모든 문자 정보가 필요할 때 사용

###아스키 코드
문자열을 구성하고 char형으로 표현되는 문자는 사실 정수형 int의 축소판이다
즉, 문자는 내부적으로 정수로 취급되고 연산된다
문자를 정수로, 또 정수를 문자로 바꾸는 규칙이 아스키 코드(ascii code) 이다
아스키 코드를 이용하여 문자를 정수로 바꾸거나, 소문자를 대문자로 바꾸는 등의 작업을 할 수 있다

###문자를 정수로 바꾸는 방법
| 문자    |'0'|'1'|'2'|'3'|'4'|'5'|'6'|
|-------|---|---|---|---|---|---|---|
| 아스키코드 |48|49|50|51|52|53|54|
숫자를 표현하는 문자에서 '0'의 아스키 코드를 뺴면 해당 문자가 표현하는 정수 값이 나온다
예를 들어 '5'가 표현하는 정수 값을 알아내기 위해 '5' - '0' = 53 - 48 = 5 처럼 계산한다

코드로 작성 시

```angular2html
char digit = '9';
int digitToInt = digit - '0';

//내장 라이브러리 이용 시
char digit = '9';
int digitToInt = Character.getNumericValue(digit);
```

###영문 소문자를 대문자로 바꾸는 방법
대문자 'A' ~ 'Z'는 65 ~ 90 의 값
소문자 'a' ~ 'z'는 97 ~ 122 의 값
이 값들을 살펴보면 소문자와 대문자 사이에는 'a' = 'A' 만큼 차이가 있음을 알 수 있다

```
char lower = 'e';
char upper = (char) (lower + ('a' - 'A'));

//내장 라이브러리 이용 시
char lower = 'e';
char upper = Character.toUpperCase(lower);
```

###영문 대문자를 소문자로 바꾸는 방법

```
char upper = 'E';
char lower = (char) (upper - ('a' - 'A'));

//내장 라이브러리 이용 시
char upper = 'E';
char lower = Character.toUpperCase(upper);
```

###StringBuilder

<span style="color:#808080">

반복문을 이용하여 String을 구성하는 다음 예시를 살펴봅시다
```
String az = "";
for (char c = 'a'; c <= 'z'; c++) {
    az += c;
}
System.out.println(az); // "abcd..xyz"
```

이 코드는 정상적으로 'a'부터 'z'까지 문자를 이어 붙인 문자열을 구성하지만 이렇게 코드를 작성하면 매 반복마다 새로운 문자열 객체가 생성되고, 새로운 문자의 배열을 복사한다
즉, 가장 처음 만든 빈 문자열 "" 부터 'a'가 추가된 "a", 'b'가 추가된 "ab", ... "abc..xyz" 까지 모든 문자열 객체가 생성된다
배열을 복사하는 데 배열의 모든 원소를 참조해야 하므로, 배열 길이 N에 대해 O(N)의 시간이 소요된다
문자열도 내부적으로 배열을 사용하므로 길이가 N인 새로운 문자열을 만드는 데 O(N)이 소요된다
이 과정을 빈 문자열부터 길이를 하나씩 늘려가며 반복하므로 (길이가 1인 문자열을 만드는 데 필요한 시간) + (길이가 2인 문자열을 만드는 데 필요한 시간) + .. + (길이가 n인 문자열을 만드는 데 필요한 시간) = O(N<sup>2</sup>) 의 시간이 걸린다. 단순 "abc...xyz" 를 만드는 데 제곱의 시간 복잡도가 소요된다

</span>

이를 해결하기 위해 StringBuilder 클래스를 이용하여 문자를 이어 붙이거나 뺴는 등 수정할 때마다 새로운 문자열을 만들지 않고 내부 배열에서 직접 수정한다
문자를 이어 붙이는 것은 배열 뒤에 원소 하나를 집어 넣는 것이니 상수 시간 O(1)이 기대 시간 복잡도가 된다

---
###string 관련 메소드
```
String str = "abcde";

str.length() // str의 길이 반환
str.isEmpty() // str의 길이가 0이면 true, 아니면 false

str.charAt(2) // 인덱스로 문자 찾기, c 반환
str.indexOf("c") // 문자로 첫번째 인덱스 찾기, 2 반환
str.lastIndexOf("c") // 문자의 마지막 인덱스 찾기, 2 반환

str.substring(2, 4) // 2~3 위치의 문자열 "cd" 반환
str.substring(3) // 3부터 끝까지의 문자열 "de" 반환

str.replace('b', 'k') // b를 k로 변경 (akcde)

str.equals("abcde") // str과 abcde를 비교해서 같으면 true, 다르면 false
str.contains("bc") // str에 bc가 포함되어 있으면 true, 아니면 false

str.split(" ") // 띄어쓰기로 구분된 문자열 str을 분리해서 String[] 배열 반환
str.split() // 띄어쓰기 없는 문자열 str을 한 문자씩 분리해서 String[] 배열 반환

str.trim() // str의 앞뒤 공백 제거, 문자열 사이 공백은 제거 X

str.toLowerCase() // 대문자를 모두 소문자로 변경
str.toUpperCase() // 소문자를 모두 대문자로 변경

str.compareTo("abcdd")
/*
str과 abcdd가 같으면 0
str이 abcdd보다 사전순으로 앞이면 -1
str이 abcdd보다 사전순으로 뒤면 1
str과 abcdd가 마지막 문자만 다르면 마지막 문자의 사전순 차이 반환 (여기선 1)
*/

Integer.parseInt("300") // 문자열을 숫자로 변환
Integer.toString(300) // 숫자를 문자열로 변환
```

###StringBuilder 관련 메소드
```
StringBuilder sb = new StringBuilder();

sb.append("abc") // 문자열 추가
sb.insert(2, "kk") // 2 위치에 kk 삽입 (→ abkkc)

sb.delete(0, 2) // 0~1 위치의 문자열 삭제 (→ c)
sb.deleteCharAt(2) // 2 위치의 문자 삭제 (→ ac)

sb.setCharAt(0, 'h') // 0 위치의 문자를 h로 변경 (→ hbc)

sb.reverse() // 문자열 거꾸로 뒤집기 (→ cba)

sb.setLength(2) // 문자열 길이를 2로 줄임 (→ ab)
sb.setLength(4) // 문자열 길이를 4로 늘림 (→ 뒤가 공백으로 채워짐)
```

###List 관련 메소드
```
List<String> list = new ArrayList<>();

list.add("서울") // list의 가장 뒤에 서울 삽입
list.add(1, "대전") // 1 위치에 대전 삽입
list.addAll(list2) // list의 뒤에 list2의 모든 값 삽입

list.get(0) // 0 위치의 값 반환 (서울)
list.set(0, "대구") // 0 위치의 값을 대구로 변경

list.indexOf("대구") // 대구의 첫번째 인덱스 반환
list.lastIndexOf("대구") // 대구의 마지막 인덱스 반환

list.remove(0) // 0 위치의 값 삭제
list.remove("대구") // 첫번째 대구 삭제
list.removeAll(list2) // list에서 list2에 들어있는 모든 값을 삭제
list.retainAll(list2) // list에서 list2에 들어있는 값을 제외한 모든 값을 삭제

list.clear() // 전체 값 삭제
list.isEmpty() // 길이가 0이면 true, 아니면 false
list.size() // 길이

list.contains("서울") // 서울이 list에 있으면 true, 없으면 false
list.containsAll(list2) // list에 list2의 모든 값이 포함되어 있으면 true

list.removeIf(k -> k % 2 != 0) // 람다식으로 홀수를 list에서 모두 제거


// 문자열 배열을 List로 변환
String[] temp = "abcde";
List<String> list = new ArrayList<>(Arrays.asList(temp));

// List를 문자열 배열로 변환
List<String> list = new ArrayList<>();
String[] temp = list.toArray(new String[list.size()]);

// 정수 배열을 List로 변환
int[] temp = { 1123, 1412, 23, 44, 512132 };
List<Integer> list = new ArrayList<>(Arrays.asList(temp));

// List를 정수 배열로 변환
List<Integer> list = new ArrayList<>();
int[] temp = list.stream().mapToInt(i->i).toArray();
```

###Collections 관련 메소드
```
int[] arr = { 1123, 1412, 23, 44, 512132 };
List<Integer> list = new ArrayList<>(Arrays.asList(arr));

Collections.max(list) // list의 원소 중 가장 큰 값 반환
Collections.min(list) // list의 원소 중 가장 작은 값 반환

Collections.sort(list) // list 오름차순 정렬
Collections.sort(list, Collections.reverseOrder()) // list 내림차순 정렬

Collections.reverse(list) // list 역순 정렬 { 512132, 44, 23, 1412, 1123 }

Collections.frequency(list, 23) // list 내의 23의 갯수 반환

Collections.binarySearch(list, 44)
// 최초로 검색된 44의 인덱스 1 반환
// 없으면 44보다 큰 최초의 위치 2를 찾아서 -1을 곱하고 1을 빼서 반환 (-3)
```
