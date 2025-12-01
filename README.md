# tonextpage의 LaTeX 문서 모음

## preamble의 tcolorbox 환경 이용법
### 정의(definition)
**사용법**
```TeX
\begin{dfn}{제목}{참조 키워드}
  내용
\end{dfn}
```
**사용 예시**
```TeX
\section{위상공간의 정의}
\begin{dfn}{위상공간}{1.1}
  집합 $X$의 부분집합들의 모임 ${\mathcal T}\subset{\mathcal P}(X)$가 다음 조건을 만족할 때, $\mathcal T$를 $X$의 \textbf{위상(topology)}라 하고 $(X,{\mathcal T})$를 \textbf{위상 공간}이라 한다.
  \begin{enumerate}[(1)]
    \item $\varnothing,X\in\mathcal T$
    \item 임의의 집합족 $\{U_\alpha\}\subset\mathcal T$에 대하여 $\bigcup_\alpha U_\alpha\in\mathcal T$이다.
    \item 임의의 유한 집합족 $\{U_i\}_{i=1}^n\subset\mathcal T$에 대하여 $\bigcap_{i=1}^nU_i\in\mathcal T$이다.
  \end{enumerate}
\end{dfn}
정의 \ref{dfn:1.1}에서 $\mathcal T$의 원소를 \textbf{열린집합(open set)}이라 한다. 반대로 $C$의 여집합 $X\setminus C$가 열린집합이면 $C$를 \textbf{닫힌집합(closed set)}이라 한다.
```
### 예시(example)와 예제(example problem)
**사용법**
```TeX
% 예시
\begin{example}{제목}{참조 키워드}
  내용
\end{example}

% 예제
\begin{exc}{제목}{참조 키워드}
  내용
\end{exc}
```
**사용 예시**
```TeX
\begin{example}{비이산 위상과 이산 위상}{1.2}
  집합 $X$에 대하여
  \begin{enumerate}[(1)]
    \item $\{\varnothing,X\}$로 구성된 위상을 $X$의 \textbf{비이산 위상(indiscrete topology)}이라 한다.
    \item $X$의 모든 부분집합의 집합 ${\mathcal P}(X)$로 구성된 위상을 $X$의 \textbf{이산 위상(discrete topology)}이라 한다.
  \end{enumerate}
\end{example}
```
### 정리(theorem)
**사용법**
```TeX
% 정리
\begin{thm}{제목}{참조 키워드}
  내용
\end{thm}

% 보조정리
\begin{lemma}{제목}{참조 키워드}
  내용
\end{lemma}

% 명제
\begin{prop}{제목}{참조 키워드}
  내용
\end{prop}
```
**사용 예시**
```TeX
\begin{thm}{닫힌집합의 기본 성질}{1.4}
  위상공간 $X$에 대하여 다음이 성립한다.
  \begin{enumerate}[(1)]
    \item $\varnothing$, $X$는 닫힌집합이다.
    \item 임의의 닫힌집합족 $\{C_\alpha\}$에 대하여 $\bigcap_\alpha C_\alpha$은 닫힌집합이다.
    \item 임의의 유한 닫힌집합족 $\{C_i\}_{i=1}^n$에 대하여 $\bigcup_{i=1}^nC_i$는 닫힌집합이다.
  \end{enumerate}
\end{thm}
```
### 증명(proof)
**사용법**
```TeX
\begin{proof}
  내용
\end{proof}
```
**사용 예시**
```TeX
\begin{proof}
  \phantom{}
  \begin{enumerate}[(1)]
    \item $\varnothing=X\setminus X$이고 $X=X\setminus\varnothing$이므로 $\varnothing$과 $X$는 닫힌집합이다.
    \item 닫힌집합족 $\{C_\alpha\}$에 대하여 $C_\alpha=X\setminus U_\alpha$인 열린집합 $U_\alpha$를 선택하자. 드모르간 법칙에 의해
      \[
        \bigcap_\alpha C_\alpha=\bigcup_\alpha X\setminus U_\alpha=X\setminus\bigcup_\alpha U_\alpha
      \]
      이고 $\bigcup_\alpha U_\alpha$는 열린집합이므로 $\bigcap_\alpha C_\alpha$는 닫힌집합이다.
    \item 유한 닫힌집합족 $\{C_i\}_{i=1}^n$에 대하여 $C_i=X\setminus U_i$인 열린집합 $U_i$를 선택하자. 드모르간 법칙에 의해
      \[
        \bigcup_{i=1}^nC_i=\bigcup_{i=1}^n X\setminus U_i=X\setminus\bigcap_{i=1}^nU_i
      \]
      이고 $\bigcap_{i=1}^nU_i$는 열린집합이므로 $\bigcup_{i=1}^nC_i$는 닫힌집합이다.\qedhere
  \end{enumerate}
\end{proof}
```
### 참고(remark)
**사용법**
```TeX
\begin{remark}[제목(기본값="참고")]
  내용
\end{remark}
```
**사용 예시**
```TeX
\begin{remark}
  정리 \ref{thm:1.4}에 의해 위상을 닫힌집합을 설정하여 정의할 수 있음을 알 수 있다.
\end{remark}
```
### 연습문제(exercise)
**사용법**
```TeX
\begin{prob}{제목}{참조 키워드}
  내용
\end{prob}
```
**사용 예시**
```TeX
\begin{prob}{여유한위상}{1}
  집합 $X$에 대하여 집합족 ${\mathcal T}_f$를 다음과 같이 정의하자.
  \[
    {\mathcal T}_f=\{U\in X\mid X\setminus U\text{가 유한집합이거나 }X\text{ 전체이다.}\}
  \]
  ${\mathcal T}_f$가 $X$의 위상임을 보여라. 이 위상을 $X$의 \textbf{여유한위상(finite complement topology)}라 한다.
\end{prob}
```
### 풀이(solution)
**사용법**
```TeX
\begin{sol}[제목=기본값=""]
  내용
\end{sol}
```
**사용 예시**
```TeX
\begin{sol}
  $X\setminus\varnothing=X$이고 $X\setminus X=\varnothing$은 유한집합이므로 $\varnothing,X\in{\mathcal T}$이다. ${\mathcal T}_f$의 임의의 부분집합족 $\{U_\alpha\}$에 대하여 집합
  \[
    X\setminus\bigcup_\alpha U_\alpha=\bigcap_\alpha X\setminus U_\alpha
  \]
  는 유한집합($U_\alpha$ 중 유한집합이 존재하는 경우)이거나 $X$ 전체(모든 $U_\alpha$가 $X$인 경우)이므로 $\bigcup_\alpha U_\alpha$\in{\mathcal T}_f$이다. ${\mathcal T}_f$의 임의의 유한 부분집합족 $\{U_i\}_{i=1}^n$에 대하여 집합
  \[
    X\setminus\bigcup_{i=1}^nU_i=\bigcup_{i=1}^nX\setminus U_i
  \]
  는 유한집합(모든 $U_\alpha$가 $X$의 진부분집합인 경우)이거나 $X$ 전체($U_i$ 중 하나가 $X$인 경우)이므로 $\bigcap_{i=1}^nU_i\in{\mathcal T}_f$이다. 그러므로 정의에 의해 ${\mathcal T}_f$는 $X$의 위상이다.
\end{sol}
```
