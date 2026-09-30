# Android Programming Practice

대학교 모바일 프로그래밍 수업에서 Android Studio와 Java를 활용하여
Android 앱 개발의 기본 구조와 UI, 이벤트 처리 등을 학습한 실습 기록입니다.

기본 화면 구성부터 입력과 선택 이벤트, View 속성 변경, 동적 UI 생성까지 12개의 실습을 담았습니다. 각 폴더는 독립적인 Android Studio 프로젝트이며, 실습 당시의 프로젝트명과 소스 코드를 유지했습니다.

## Tech Stack

- **언어 및 화면 구성:** Java, XML Layouts, Android SDK의 View/Widget
- **Activity 및 레이아웃:** AndroidX AppCompat, ConstraintLayout, LinearLayout
- **UI 테마:** Material Components의 Material 3 기본 테마
- **개발 및 빌드 도구:** Android Studio, Gradle

대부분 Java와 XML을 함께 사용하며, `Week5Example2`는 Java 코드에서 화면을 직접 구성합니다.

## Practice

기본 구조 → 클릭과 입력 → 속성 변경 → 선택 상태 처리 → 동적 View 생성 순서로 정리했습니다.

| 프로젝트 | 학습 주제 | 핵심 구현 기능 |
| --- | --- | --- |
| [Week2](./Week2/) | Activity와 기본 XML 화면 | ConstraintLayout 중앙에 Hello World 표시, 시스템 바 영역을 고려한 패딩 처리 |
| [Week22](./Week22/) | 클릭 이벤트와 텍스트 변경 | 버튼 클릭 시 TextView의 문구를 `Change!`로 변경 |
| [Week4Example1](./Week4Example1/) | Toast 메시지 | 버튼 클릭 시 `Click!` 메시지 출력 |
| [Practice2](./Practice2/) | 문자열 누적과 초기화 | A/B 버튼으로 문자를 이어 붙이고 RESET으로 초기화 |
| [Week4Example2](./Week4Example2/) | EditText 입력 처리 | 버튼 클릭 시 입력한 문자열을 TextView에 표시 |
| [Week4Example3](./Week4Example3/) | 정수 변환과 사칙연산 | 두 입력값을 정수로 변환하여 덧셈·뺄셈·곱셈·정수 나눗셈 수행 |
| [Practice3](./Practice3/) | 변수로 View 상태 관리 | Java 람다로 클릭 처리, 크기·각도를 변수에 저장하여 글자 크기 ±2sp 및 회전 ±10도 변경, 최소 크기 2sp 제한 |
| [Practice4](./Practice4/) | View의 현재 속성 조회·변경 | 익명 OnClickListener에서 현재 글자 크기를 읽어 ±5를 전달하고, 현재 회전 각도를 ±10도 변경 |
| [Week4Example4](./Week4Example4/) | RadioButton 선택 이벤트 | RadioGroup 안의 선택 항목이 바뀌면 해당 라디오 버튼의 Toast 출력 |
| [Practice5](./Practice5/) | 입력과 선택 상태를 UI에 반영 | 확인 버튼으로 대상 버튼의 문구, 활성화 여부, 배경색(흰색·빨강·파랑) 변경 |
| [Week5Example1](./Week5Example1/) | XML 컨테이너에 View 추가 | 기존 버튼 2개가 있는 LinearLayout에 Java로 버튼 2개를 추가하고, 추가한 버튼에 Toast 이벤트 연결 |
| [Week5Example2](./Week5Example2/) | Java로 화면 구성과 동적 View 생성 | LinearLayout과 Button을 코드로 구성하고, 클릭할 때마다 번호가 붙은 TextView 추가 |

실습 코드에는 다음과 같은 특성이 있습니다.

- **Practice3 / Practice4:** Practice3는 별도 변수로 크기와 각도를 관리합니다. Practice4는 View에서 현재 값을 읽습니다. Practice4의 `getTextSize()` 반환값은 px이고 `setTextSize(float)`는 sp 기준이므로, 현재 코드는 정확한 5sp 단위 증감을 보장하지 않습니다. 최소 크기 제한도 없습니다.
- **Week4Example3:** 정수 나눗셈을 사용하며, 빈 입력이나 0으로 나누는 경우의 예외 처리는 구현하지 않았습니다.
- **Week5Example1:** XML의 LinearLayout에 ConstraintLayout 제약조건이 지정되어 있지 않아 화면 배치는 추가 보완이 필요합니다.

## What I Learned

- `setContentView`로 Activity와 XML Layout을 연결하고, `findViewById`로 View에 접근하는 방법
- ConstraintLayout의 제약조건과 LinearLayout의 방향 설정을 이용한 화면 구성
- `OnClickListener`와 Java 람다를 이용한 클릭 이벤트 처리
- EditText의 입력값을 문자열로 읽고, `Integer.parseInt`로 정수로 변환하여 계산하는 방법
- RadioGroup의 단일 선택, RadioButton의 선택 변경 이벤트, CheckBox의 체크 상태 처리
- TextView의 문구·글자 크기·회전 각도와 Button의 문구·활성화 상태·배경색 변경
- Toast를 이용해 클릭 및 선택 결과를 간단한 메시지로 표시하는 방법
- Java에서 View를 생성하고 `addView`로 추가하는 방식과 XML로 화면을 구성하는 방식의 차이
- 크기 단위(px/sp)의 구분과 숫자 입력 검증 등 실습 코드에서 보완할 부분

## 프로젝트 열기

Android Studio에서 확인할 프로젝트 폴더(예: `Practice2`)를 개별적으로 열고 Gradle 동기화를 진행합니다. 저장소 전체를 하나의 앱으로 합친 구조는 아닙니다.

- 각 프로젝트의 Gradle Wrapper와 빌드 설정을 포함했습니다. Java 소스 호환성은 11, `minSdk`는 24, `compileSdk`와 `targetSdk`는 37로 설정되어 있습니다.
- SDK 경로를 담는 `local.properties`는 포함하지 않았으므로 로컬 Android Studio 환경에서 설정합니다.
- `Week2`와 `Week22`는 앱 식별자(`com.example.week2`)가 같아 같은 기기에 별도 앱으로 함께 설치되지 않습니다.
- `Week5Example`은 `Week2`와 화면 및 동작이 중복되어 제외했습니다.

이 문서는 소스 코드 분석을 기준으로 작성했습니다. 저장소 정리 과정에서 별도의 빌드·에뮬레이터 실행 검증은 수행하지 않았습니다.
