# Case-Sensitive-Character-Count
<p>Accept a string <strong>S</strong>, an integer <strong>N</strong> denoting the alphabet <strong>A</strong> position. Also another alphabet <strong>M</strong> indicating if the case must be lower or upper case. The program must print the count of alphabet <strong>A</strong> in the string S as the output. If the alphabet <strong>A</strong> is not present in <strong>S, </strong>then print -1.<br>
<strong>Note:</strong> <strong>M</strong> must be <strong>'l'</strong> or <strong>'L'</strong> to represent lower case. <strong>M</strong> must be <strong>'u'</strong> or <strong>'U'</strong> to represent the upper case.</p>

<p><strong>Boundary Condition(s):</strong><br>
1 &lt;= N &lt;= 26<br>
5 &lt;= Length of S &lt;= 1000</p>

<p><strong>Input Format:</strong><br>
The first line contains <strong>S</strong>.<br>
The second line contains <strong>N</strong>.<br>
The third line contains the character <strong>M</strong>.</p>

<p><strong>Output Format:</strong><br>
The first line contains the count of the alphabet<strong> A </strong>in the string<strong> S.</strong></p>

<p><strong>Example Input/ Output 1:</strong><br>
Input:<br>
apple Animal Orange<br>
1<br>
u</p>

<p>Output:<br>
1</p>

<p><strong>Explanation:</strong><br>
The integer<strong> 1</strong> represents <strong>'a' or 'A'</strong>.<br>
The character <strong>M</strong> is <strong>'u'</strong> which represents the upper case.<br>
The count of <strong>'A' </strong>in the given string <strong>S </strong>is <strong>1</strong>.<br>
So<strong> 1</strong> is printed as the output.&nbsp;</p>

<p><strong>Example Input/ Output 2:</strong><br>
Input:<br>
GOOD PROGRAMMER<br>
5<br>
L</p>

<p>Output:<br>
-1</p>

<p><strong>Explanation:</strong><br>
The integer<strong> 5</strong> represents <strong>'e' or 'E'</strong>.<br>
The character <strong>M</strong> is<strong> 'L'</strong> which represents the lower case.<br>
The count of&nbsp; <strong>'e'</strong> in the given string <strong>S </strong>is<strong> 0.</strong><br>
So <strong>-1 </strong>is printed as the output.</p>
