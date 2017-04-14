import Component from 'metal-component/src/Component';
import Soy from 'metal-soy/src/Soy';


class SoyPortlet extends Component {
    constructor(opt_config) {
        super(opt_config);
    }

 
    created() {
        console.log('created');
    }

    attached() {
        console.log('attached');
    }


}

// Register component
Soy.register(SoyPortlet, templates);

export default SoyPortlet;