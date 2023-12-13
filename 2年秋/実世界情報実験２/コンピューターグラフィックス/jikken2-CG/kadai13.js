
window.addEventListener("DOMContentLoaded", init);

function init() {
    const width = 500;
    const height = 500;
    const robot = new THREE.Group();
    let flag_position = 0;
    let count_position = 0;
    // レンダラーを作成 
    const renderer = new THREE.WebGLRenderer({
        canvas: document.querySelector("#myCanvas")
    });
    renderer.setSize(width, height); /* ウィンドウサイズの設定 */
    renderer.setClearColor(0x000000); /* 背景色の設定 */

    // シーンを作成 
    const scene = new THREE.Scene();

    // カメラを作成 
    const camera = new THREE.PerspectiveCamera(45, width / height);
    camera.position.set(0, 0, -140);
    camera.lookAt(new THREE.Vector3(0, 0, 0));

    //マテリアル作成
    const bodyMat = new THREE.MeshStandardMaterial({
        color: 0xaaaaaa
    });
    const highlight = new THREE.MeshStandardMaterial({
        color: 0x4444ff
    });
    const red = new THREE.MeshStandardMaterial({
        color: 0xff0000
    });
    const white = new THREE.MeshStandardMaterial({
        color: 0xffffff
    });

    // var axes = new THREE.AxisHelper(25);
    // scene.add(axes);
    //メッシュ作成
    const head = new THREE.Mesh(new THREE.BoxGeometry(20, 16, 16), bodyMat);
    scene.add(head);

    const eye1 = new THREE.Mesh(new THREE.SphereGeometry(1.5, 16, 12), highlight);
    eye1.position.set(5, 3, -8);
    scene.add(eye1);

    const eye2 = new THREE.Mesh(new THREE.SphereGeometry(1.5, 16, 12), highlight);
    eye2.position.set(-5, 3, -8);
    scene.add(eye2);

    const mouse = new THREE.Mesh(new THREE.CylinderGeometry(2, 2, 1, 3), highlight);
    mouse.position.set(0, -3, -8);
    mouse.rotation.set(Math.PI / 2, Math.PI, 0);
    scene.add(mouse);

    const ear1 = new THREE.Mesh(new THREE.BoxGeometry(5, 8, 5), highlight);
    ear1.position.set(10, 0, 0);
    scene.add(ear1);

    const ear2 = new THREE.Mesh(new THREE.BoxGeometry(5, 8, 5), highlight);
    ear2.position.set(-10, 0, 0);
    scene.add(ear2);

    const body = new THREE.Mesh(new THREE.BoxGeometry(30, 32, 16), red);
    body.position.set(0, -24, 0);
    scene.add(body);

    const leg1 = new THREE.Mesh(new THREE.CylinderGeometry(3, 3, 16), white);
    leg1.position.set(5, -48, 8);
    scene.add(leg1);

    const leg2 = new THREE.Mesh(new THREE.CylinderGeometry(3, 3, 16), white);
    leg2.position.set(-5, -48, 8);
    scene.add(leg2);

    const arm1 = new THREE.Mesh(new THREE.CylinderGeometry(3, 3, 22), white);
    arm1.position.set(18, -24, 0);
    arm1.rotation.set(0, 0, Math.PI / 6);
    scene.add(arm1);

    const arm2 = new THREE.Mesh(new THREE.CylinderGeometry(3, 3, 22), white);
    arm2.position.set(-18, -24, 0);
    arm2.rotation.set(0, 0, -Math.PI / 6);
    scene.add(arm2);
    robot.add(head, eye1, eye2, mouse, ear1, ear2, body, leg1, leg2, arm1, arm2);
    scene.add(robot);

    document.addEventListener("keydown", onDocumentKeyDown, false);
    function onDocumentKeyDown(event_k) {
        let keyCode = event_k.which;
        // jキーでジャンプ
        if (keyCode == 74) {
            flag_position = 1;
            animate();
        }
    }

    //ジャンプする速さと加速度
    let accelation = -0.5;
    let speed = 6;

    //ロボットのジャンプ
    function animate() {
        if (count_position < 0) {
            count_position = 0;
            flag_position = 0;
            speed = 6;
            robot.position.set(0, 0, 0);
        }
        else if (flag_position == 1) {
            let requestId = requestAnimationFrame(animate);
            robot.position.y += speed;
            count_position += speed;
            speed += accelation;
        }
        render();
    }

    //光源設定

    // 平行光源 
    const directionalLight = new THREE.DirectionalLight(0xffffff, 1);
    directionalLight.position.set(0, 0, 1);
    // シーンに追加 
    scene.add(directionalLight);

    const ambientLight = new THREE.AmbientLight(0xffffff, 0.8);
    scene.add(ambientLight);

    // 初回実行 
    let render = function () { renderer.render(scene, camera); };
    render();
}
