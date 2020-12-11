import sys

import drawSvg as draw_svg

"""
Only for inputlen = 4. supply labels via cmdargs
"""

inpcount = 4
labels = sys.argv[2:]


# lines = [[bool(int(x)) for x in line.strip()] for line in sys.stdin]

class KarnaughImage:
    def __init__(self, toplabel, botlabel, leftlabel, rightlabel):
        self.draw = draw_svg.Drawing(1024, 1024)
        self.generate_empty_table()

    def generate_empty_table(self):
        path = draw_svg.Path(fill_opacity=0, stroke_width=5, stroke="black")
        l = 125
        h = 1024 - 125
        m = 1024 // 2
        path.M(l, l)
        path.L(l, h)
        path.L(h, h)
        path.L(h, l)
        path.L(l, l)
        path.M(l, m)
        path.L(h, m)
        path.M(m, l)
        path.L(m, h)
        self.draw.append(path)

    def save(self, name):
        self.draw.saveSvg(name)


if __name__ == '__main__':
    img = KarnaughImage(*'abcd')
    img.save('out.svg')
