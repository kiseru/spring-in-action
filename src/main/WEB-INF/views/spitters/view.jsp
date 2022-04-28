<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table cellspacing="0">
  <tr>
    <th>Username:</th>

    <td>
      <c:out value="${spitter.username}"/>
    </td>
  </tr>

  <tr>
    <th>Full Name:</th>

    <td>
      <c:out value="${spitter.fullName}"/>
    </td>
  </tr>

  <tr>
    <th>Email Address:</th>

    <td>
      <c:out value="${spitter.email}"/>
    </td>
  </tr>
</table>