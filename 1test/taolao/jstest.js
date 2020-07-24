let producname = ["Alcatel-Lucent", "ZTE", "Lenovo", "LG", "Xiaomi", "Vivo", "Oppo", "Huawei", "Apple", "Samsung"];
htmlElement = "";
for (let i = 0; i < producname.length; i++) {
    htmlElement += `
<tr>
    <td>${producname[i]}</td>
    <td>Edit</td>
    <td>Delete</td>
</tr>

`
}
document.getElementById('container2').innerHTML = htmlElement;